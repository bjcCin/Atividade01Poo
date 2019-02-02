package br.com.codenation.aceleradev.rec.loja.model;

public class Movie extends  Product {

    private String directorName;
    private String initYear;

    public Movie(Long id, double price, int stockCount, int category, String nameArtist, int musicCount, String nameDirector, String initYear, String version, String requisits, String directorName, String initYear1) {
        super(id, price, stockCount, category, nameArtist, musicCount, nameDirector, initYear, version, requisits);
        this.directorName = directorName;
        this.initYear = initYear1;
    }

    public Movie() {
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getInitYear() {
        return initYear;
    }

    public void setInitYear(String initYear) {
        this.initYear = initYear;
    }
}
