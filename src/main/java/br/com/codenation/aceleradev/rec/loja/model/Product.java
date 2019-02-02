package br.com.codenation.aceleradev.rec.loja.model;

import java.util.Date;

public abstract class Product {

    private int id;
    private double price;
    private int stockCount;
    private int category;

    public Product(int id, double price, int stockCount, int category, String nameArtist, int musicCount, String nameDirector, String initYear, String version, String requisits) {
        this.id = id;
        this.price = price;
        this.stockCount = stockCount;
        this.category = category;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }


}
