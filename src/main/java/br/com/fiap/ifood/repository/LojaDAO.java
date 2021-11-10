package br.com.fiap.ifood.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.ifood.entities.Loja;

public class LojaDAO {

	private Connection connection;

	public LojaDAO(Connection connection) {
		this.connection = connection;
	}

	public void create(Loja loja) throws SQLException {

		int id = 0;
		ResultSet rs = connection.createStatement().executeQuery("SELECT COUNT(CD_LOJA) count FROM T_LOJA");

		while (rs.next()) {
			id = rs.getInt("count") + 1;
		}

		loja.setCdLoja(id);


		PreparedStatement stmt = connection.prepareStatement(
				"INSERT INTO T_LOJA (CD_LOJA, CD_PLANO, CD_ESPECIALIDADE, ENDERECO_CD_ENDERECO, CD_CARDAPIO, CD_CNPJ, NM_RAZAO_SOCIAL, NM_NOME, NR_CELULAR, VL_MED_PEDIDO_DIA, DT_ABERTURA, DT_FECHAMENTO, NR_TELEFONE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		stmt.setInt(1, id);
		stmt.setInt(2, loja.getCdPlano());
		stmt.setInt(3, loja.getCdEspecialidade());
		stmt.setInt(4, loja.getCdEndereco());
		stmt.setNull(5, 0);
		stmt.setString(6, loja.getCdCNPJ());
		stmt.setString(7, loja.getNmRazaoSocial());
		stmt.setString(8, loja.getNome());
		stmt.setString(9, loja.getNrCelular());
		stmt.setInt(10, loja.getMediaPedidoPorDia());
		stmt.setDate(11, new Date(loja.getAbertura().getTime()));
		stmt.setDate(12, new Date(loja.getFechamento().getTime()));
		stmt.setString(13, loja.getNrTelefone());

		stmt.execute();
	}

}
