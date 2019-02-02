package br.com.codenation.aceleradev.rec.loja.service;

import br.com.codenation.aceleradev.rec.loja.dao.ProductDAO;
import br.com.codenation.aceleradev.rec.loja.model.Product;

public abstract class ProductController {
    protected ProductDAO productDAO = new ProductDAO();

    public Product getProduct(int id) {
        Product product = productDAO.findProduct(id);
        return product;
    }
}
