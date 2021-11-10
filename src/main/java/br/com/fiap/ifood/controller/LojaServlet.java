package br.com.fiap.ifood.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ifood.entities.Especialidade;
import br.com.fiap.ifood.entities.Loja;
import br.com.fiap.ifood.repository.ConnectionStatic;
import br.com.fiap.ifood.repository.EspecialidadeDAO;
import br.com.fiap.ifood.repository.LojaDAO;

@WebServlet("/loja")
public class LojaServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection connection = ConnectionStatic.getInstace();

		EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO(connection);

		try {
			List<Especialidade> especialidades = especialidadeDAO.getEspecialidade();

			req.setAttribute("especialidades", especialidades);

			RequestDispatcher rd = req.getRequestDispatcher("view/informacoes.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection connection = ConnectionStatic.getInstace();

		LojaDAO dao = new LojaDAO(connection);

		String cnpj = req.getParameter("cnpj");
		String razaoSocial = req.getParameter("razaoSocial");
		String nome = req.getParameter("nome");
		String celularOuTelefone = req.getParameter("celularOuTelefone");
		String cdEspecialidade = req.getParameter("cdEspecialidade");
		String mediaPedidoPorHora = req.getParameter("mediaPedidoPorHora");

		String idPlano = (String) req.getSession().getAttribute("idPlano");
		Integer idEndereco = (Integer) req.getSession().getAttribute("idEndereco");

		Loja loja = new Loja(0, Integer.parseInt(idPlano), Integer.parseInt(cdEspecialidade), idEndereco, cnpj,
				razaoSocial, nome, celularOuTelefone, Integer.parseInt(mediaPedidoPorHora), new Date(),
				new Date(), null);

		try {
			dao.create(loja);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
