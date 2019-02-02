package br.com.codenation.aceleradev.rec.loja.service;
import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import java.util.List;

public class ShowController extends ProductController {
    ProductDAO productDAO = new ProductDAO();

    public List<Product> getAllShows() {
        List<Product> shows = productDAO.listProductsByCategory(0);
        return shows;
    }
}
