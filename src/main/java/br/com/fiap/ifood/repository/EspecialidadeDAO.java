package br.com.fiap.ifood.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.ifood.entities.Especialidade;

public class EspecialidadeDAO {
	private Connection connection;

	public EspecialidadeDAO(Connection connection) {
		this.connection = connection;
	}

	public List<Especialidade> getEspecialidade() throws SQLException {

		List<Especialidade> especialidades = new ArrayList<>();

		Statement stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT CD_ESPECIALIDADE, NM_ESPECIALIDADE FROM T_ESPECIALIDADE");

		while (rs.next()) {
			Especialidade especialidade = new Especialidade(rs.getInt("CD_ESPECIALIDADE"),
					rs.getString("NM_ESPECIALIDADE"));
			especialidades.add(especialidade);
		}

		return especialidades;
	}

}
