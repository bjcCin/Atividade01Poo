package br.com.codenation.aceleradev.rec.loja.service;

import br.com.codenation.aceleradev.rec.loja.exceptions.InvalidUserException;

public class UserController {


    String dao;

    public String getUser(String CPF) throws InvalidUserException {

        if(CPF == null){
            throw new InvalidUserException("Usuario Invalido");

        }

        return CPF;
    }


    public void getProducts() {

    }

    public void getShows() {

    }

    public void getSoftwares() {

    }

}
