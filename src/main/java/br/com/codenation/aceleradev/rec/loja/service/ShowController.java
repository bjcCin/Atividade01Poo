package br.com.codenation.aceleradev.rec.loja.service;
import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;
import java.util.List;

public class ShowController {
    private ProductDAO productDAO = new ProductDAO();

    public List<Product> getShow() {
        List<Product> show = productDAO.listProductsByCategory(0);
        System.out.println(show);
        return show;
    }
}
