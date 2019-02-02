package br.com.codenation.aceleradev.rec.loja.service;

import br.com.codenation.aceleradev.rec.loja.dao.UserDAO;
import br.com.codenation.aceleradev.rec.loja.exceptions.InvalidUserException;
import br.com.codenation.aceleradev.rec.loja.model.User;

public class UserController {


    public User getUser(String CPF) throws InvalidUserException {

        UserDAO user = new UserDAO();


        User usuarioLogado = user.findUser(CPF);

        if (usuarioLogado == null){
            throw new InvalidUserException("Usuario invalido, digite novamente!");
        }


        return usuarioLogado;
    }



}
