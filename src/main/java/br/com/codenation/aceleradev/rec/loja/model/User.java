package br.com.codenation.aceleradev.rec.loja.model;

public class User {

    private Long id;
    private String name;
    private String CPF;

    public User(Long id,String name, String CPF) {
        this.id = id;
        this.name = name;
        this.CPF = CPF;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
