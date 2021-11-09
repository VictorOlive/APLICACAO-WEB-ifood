package br.com.fiap.ifood.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.ifood.entities.Plano;

public class PlanoDAO {

	Connection connection;

	public PlanoDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Plano> getPlanos() throws SQLException {

		List<Plano> planos = new ArrayList<Plano>();
		PreparedStatement stmt = connection.prepareStatement("SELECT CD_PLANO, NM_PLANO, VL_COMISAO, VL_TAXA, VL_MENSALIDADE FROM T_PLANO");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Plano plano = new Plano(rs.getInt("CD_PLANO"), rs.getString("NM_PLANO"), rs.getFloat("VL_COMISAO"),
			rs.getFloat("VL_TAXA"), rs.getFloat("VL_MENSALIDADE"));

			planos.add(plano);
		}

		return planos;

	}

}
