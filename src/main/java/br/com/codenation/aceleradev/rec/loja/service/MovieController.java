package br.com.codenation.aceleradev.rec.loja.service;
import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import java.util.List;

public class MovieController extends ProductController {
    ProductDAO productDAO = new ProductDAO();

    public List<Product> getAllMovies() {
        List<Product> movies = productDAO.listProductsByCategory(2);
        return movies;
    }
}
