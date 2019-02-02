package br.com.codenation.aceleradev.rec.loja.model;

import java.util.Date;

public class Product {

    private int id;
    private double price;
    private int stockCount;
    private int category;
    private String nameArtist;
    private int musicCount;
    private String nameDirector;
    private String initYear;
    private String version;
    private String requisits;

    public Product(int id, double price, int stockCount, int category, String nameArtist, int musicCount, String nameDirector, String initYear, String version, String requisits) {
        this.id = id;
        this.price = price;
        this.stockCount = stockCount;
        this.category = category;
        this.nameArtist = nameArtist;
        this.musicCount = musicCount;
        this.nameDirector = nameDirector;
        this.initYear = initYear;
        this.version = version;
        this.requisits = requisits;
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

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public int getMusicCount() {
        return musicCount;
    }

    public void setMusicCount(int musicCount) {
        this.musicCount = musicCount;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    public String getInitYear() {
        return initYear;
    }

    public void setInitYear(String initYear) {
        this.initYear = initYear;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequisits() {
        return requisits;
    }

    public void setRequisits(String requisits) {
        this.requisits = requisits;
    }

}
