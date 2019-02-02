package br.com.codenation.aceleradev.rec.loja.service;
import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import java.util.List;

public class MovieController {
    private ProductDAO productDAO = new ProductDAO();

    public List<Product> getMovie() {
        List<Product> movie = productDAO.listProductsByCategory(2);
        return movie;
    }
}
