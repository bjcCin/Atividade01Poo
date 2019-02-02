package br.com.codenation.aceleradev.rec.loja.model;

public class Software extends  Product{

    public String version;
    public  String systemRequisits;

    public Software(int id, double price, int stockCount, int category, String nameArtist, int musicCount, String nameDirector, String initYear, String version, String requisits, String version1, String systemRequisits) {
        super(id, price, stockCount, category, nameArtist, musicCount, nameDirector, initYear, version, requisits);
        this.version = version1;
        this.systemRequisits = systemRequisits;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSystemRequisits() {
        return systemRequisits;
    }

    public void setSystemRequisits(String systemRequisits) {
        this.systemRequisits = systemRequisits;
    }
}
