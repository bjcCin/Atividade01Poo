package br.com.codenation.aceleradev.rec.loja.service;
import br.com.codenation.aceleradev.rec.loja.model.Product;

import java.util.List;

public class SoftwareController extends ProductController{

    public List<Product> getAllSoftwares() {
        List<Product> software = productDAO.listProductsByCategory(1);
        return software;
    }
}
