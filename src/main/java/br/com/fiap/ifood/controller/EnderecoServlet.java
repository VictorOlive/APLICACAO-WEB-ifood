package br.com.fiap.ifood.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ifood.entities.Endereco;
import br.com.fiap.ifood.repository.ConnectionStatic;
import br.com.fiap.ifood.repository.EnderecoDAO;

@WebServlet("/endereco")
public class EnderecoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			RequestDispatcher rd = req.getRequestDispatcher("view/endereco.jsp");
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String cep = req.getParameter("cep");
		String uf = req.getParameter("estados-brasil");
		String cidade = req.getParameter("cidade");
		String bairro = req.getParameter("bairro");
		String enderecoNome = req.getParameter("endereco");
		String numero = req.getParameter("numero");
		String complemento = req.getParameter("complemento");

		Endereco endereco = new Endereco(0, cep, uf, cidade, bairro, enderecoNome, numero, complemento);

		Connection connection = ConnectionStatic.getInstace();

		EnderecoDAO dao = new EnderecoDAO(connection);

		try {
			dao.creater(endereco);

			req.getSession().setAttribute("idEndereco", endereco.getCdEndereco());

			resp.sendRedirect("/challenge-ifood/planos");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
