package br.com.fiap.ifood.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.ifood.entities.Endereco;

public class EnderecoDAO {

	private Connection connection;

	public EnderecoDAO(Connection connection) {
		this.connection = connection;
	}

	public void creater(Endereco endereco) throws SQLException {

		int id = 0;
		ResultSet rs = connection.createStatement().executeQuery("SELECT COUNT(CD_ENDERECO) count FROM T_ENDERECO");

		while (rs.next()) {
			id = rs.getInt("count") + 1;
		}

		endereco.setCdEndereco(id);
		PreparedStatement stmt = connection.prepareStatement(
				"INSERT INTO T_ENDERECO (CD_ENDERECO, CD_CEP, DS_UF, NM_CIDADE, NM_BAIRRO, NM_ENDERECO, VL_NUMERO, DS_COMPLEMENTO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

		stmt.setInt(1, id);
		stmt.setString(2, endereco.getCdCep());
		stmt.setString(3, endereco.getDsUF());
		stmt.setString(4, endereco.getNmCidade());
		stmt.setString(5, endereco.getNmBairro());
		stmt.setString(6, endereco.getNmEndereco());
		stmt.setString(7, endereco.getLvNumero());
		stmt.setString(8, endereco.getDsComplemento());

		stmt.execute();
	}

	public Endereco getEndereco(int cdEndereco) throws SQLException {

		Endereco endereco = null; 
		PreparedStatement stmt = connection.prepareStatement(
				"SELECT CD_ENDERECO, CD_CEP, DS_UF, NM_CIDADE, NM_BAIRRO, NM_ENDERECO, VL_NUMERO, DS_COMPLEMENTO FROM T_ENDERECO WHERE CD_ENDERECO = ?");

		stmt.setInt(1, cdEndereco);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			 endereco = new Endereco(rs.getInt("CD_ENDERECO"), rs.getString("CD_CEP"),
					rs.getString("DS_UF"), rs.getString("NM_CIDADE"), rs.getString("NM_BAIRRO"),
					rs.getString("NM_ENDERECO"), rs.getString("VL_NUMERO"),
					rs.getString("DS_COMPLEMENTO"));
		}

		return endereco;
	}

}
