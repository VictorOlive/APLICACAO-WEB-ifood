package br.com.fiap.ifood.controller;

import java.io.IOException;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ifood.adapter.PlanoAdapter;
import br.com.fiap.ifood.entities.Plano;
import br.com.fiap.ifood.repository.ConnectionStatic;
import br.com.fiap.ifood.repository.PlanoDAO;

@WebServlet("/planos")
public class PlanoServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Connection connection = ConnectionStatic.getInstace();

		PlanoDAO planoDAO = new PlanoDAO(connection);

		try {

			List<Plano> planos = planoDAO.getPlanos();
			List<PlanoAdapter> planosAdapter = new ArrayList<>();

			DecimalFormat df = new DecimalFormat("0.00");

			for (Plano plano : planos) {
				planosAdapter.add(new PlanoAdapter(Integer.toString(plano.getCdPlano()),
						plano.getNmPlano(), df.format(plano.getVlComisao() * 100),
						df.format(plano.getVlTaxa() * 100),
						df.format(plano.getVlMensalidade())));
			}

			req.setAttribute("planos", planosAdapter);

			RequestDispatcher rd = req.getRequestDispatcher("view/planos.jsp");
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getSession().setAttribute("idPlano", req.getParameter("idPlano"));

		resp.sendRedirect("/challenge-ifood/loja");
	}

}
