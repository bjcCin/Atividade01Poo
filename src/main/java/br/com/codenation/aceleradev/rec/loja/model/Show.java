package br.com.codenation.aceleradev.rec.loja.model;

public class Show extends  Product{

    private String artistName;
    private int countMusics;

    public Show(int id, double price, int stockCount, int category, String nameArtist, int musicCount, String nameDirector, String initYear, String version, String requisits, String artistName, int countMusics) {
        super(id, price, stockCount, category, nameArtist, musicCount, nameDirector, initYear, version, requisits);
        this.artistName = artistName;
        this.countMusics = countMusics;
    }

    public Show() {
    }

}
