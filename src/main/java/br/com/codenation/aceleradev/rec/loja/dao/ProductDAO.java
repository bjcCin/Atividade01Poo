package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.codenation.aceleradev.rec.loja.model.Movie;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import br.com.codenation.aceleradev.rec.loja.model.Show;
import br.com.codenation.aceleradev.rec.loja.model.Software;

public class ProductDAO {
	public static final String SELECT_PRODUTOS_CATEGORIA = "SELECT * FROM produto WHERE qtd_estoque > 0 AND categoria = ? ";
	public static final String SELECT_PRODUTO_ID = "SELECT * FROM produto WHERE id = ?";
	public static final String UPDATE_ESTOQUE_PRODUTO = "UPDATE produto SET qtd_estoque = ? WHERE id = ?";

	public List<Product> listProductsByCategory(int category) {
		List<Product> products = new ArrayList<>();

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		connection = ConnectionJDBC.getConnection();

		try {
			statement = connection.prepareStatement(SELECT_PRODUTOS_CATEGORIA);
			statement.setInt(1, category);

			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Product product = createProductByCategory(category, resultSet);

				products.add(product);

			}

		} catch (SQLException e) {
			System.out.println("Falha no banco de dados. Contate administrador.");
		} finally {
			ConnectionJDBC.closeConnection(connection, statement, resultSet);
		}
		return products;
	}

	private void setCommonsAttributes(Product product, ResultSet resultSet) throws SQLException {
		product.setId(resultSet.getInt("id"));
		product.setCategory(resultSet.getInt("categoria"));
		product.setStockCount(resultSet.getInt("qtd_estoque"));
		product.setPrice(resultSet.getDouble("preco"));
		product.setDescription(resultSet.getString("descricao"));

	}

	public Product findProduct(int productId) {
		Product product = null;

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		connection = ConnectionJDBC.getConnection();

		try {
			statement = connection.prepareStatement(SELECT_PRODUTO_ID);
			statement.setInt(1, productId);

			resultSet = statement.executeQuery();

			if (resultSet.next()) {
				int category = resultSet.getInt("categoria");
				
				product = createProductByCategory(category, resultSet);
				
			}

		} catch (SQLException e) {
			System.out.println("Falha no banco de dados. Contate administrador.");
		} finally {
			ConnectionJDBC.closeConnection(connection, statement, resultSet);
		}
		return product;
	}

	private Product createProductByCategory(int category, ResultSet resultSet) throws SQLException {
		// Shows, Filmes e Softwares, correspondem, códigos 0, 1 e 2.
		Product product = null;
		
		if (category == 0) {
			product = new Show();

			setCommonsAttributes(product, resultSet);

			((Show) product).setArtistName(resultSet.getString("artista"));
			((Show) product).setCountMusics(resultSet.getInt("qtd_musicas"));
			

		}
		
		if (category == 1) {
			product = new Movie();

			setCommonsAttributes(product, resultSet);

			((Movie) product).setDirectorName(resultSet.getString("diretor"));
			((Movie) product).setInitYear(resultSet.getString("ano_lancamento"));

		}
		
		if (category == 2) {
			product = new Software();

			setCommonsAttributes(product, resultSet);

			((Software) product).setVersion(resultSet.getString("versao"));
			((Software) product).setSystemRequisits(resultSet.getString("requisitos"));

		} 

		return product;
	}

}
