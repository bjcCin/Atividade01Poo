package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.exceptions.CloseBDFailException;
import br.com.codenation.aceleradev.rec.loja.exceptions.OpenBDFailException;
import br.com.codenation.aceleradev.rec.loja.model.User;

public class UserDAO {
	public static final String SELECT_USUARIO_CPF = "SELECT * FROM usuario WHERE cpf = ?";

	public User findUser(String cpf) throws OpenBDFailException, CloseBDFailException {
		User user = new User();

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		connection = ConnectionJDBC.getConnection();

		try {
			statement = connection.prepareStatement(SELECT_USUARIO_CPF);
			statement.setString(1, cpf);

			resultSet = statement.executeQuery();

			if (resultSet.next()) {
				user.setCPF(resultSet.getString("cpf"));
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("nome"));
			}

		} catch (SQLException e) {
			return null;
		} finally {
			ConnectionJDBC.closeConnection(connection, statement, resultSet);
		}
		return user;

	}
}
