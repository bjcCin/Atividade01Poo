package br.com.codenation.aceleradev.rec.loja.service;

import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;

import java.util.List;

public class SoftwareController {
    private ProductDAO productDAO = new ProductDAO();

    public List<Product> getSoftware() {
        List<Product> software = productDAO.listProductsByCategory(1);
        return software;
    }
}
