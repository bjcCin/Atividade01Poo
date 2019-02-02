package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.exceptions.CloseBDFailException;
import br.com.codenation.aceleradev.rec.loja.exceptions.OpenBDFailException;

public class ConnectionJDBC {

	public static Connection getConnection() throws OpenBDFailException {
		String driver = "jdbc:mysql://db4free.net:3306/adminproj";
		String user = "adminproj";
		String pass = "FSFU06hq";

		try {
			return DriverManager.getConnection(driver, user, pass);
		} catch (SQLException e) {
			throw new OpenBDFailException("Não foi possível estabelecer conexão com o Banco de Dados.");
		}

	}

	public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet)
			throws CloseBDFailException {

		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				throw new CloseBDFailException("Falha para fechar conexão Result. Contate o administrador.");
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new CloseBDFailException("Falha para fechar conexão connection. Contate o administrador.");
			}
		}

		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				throw new CloseBDFailException("Falha para fechar conexão statement. Contate o administrador.");
			}
		}

	}

}
