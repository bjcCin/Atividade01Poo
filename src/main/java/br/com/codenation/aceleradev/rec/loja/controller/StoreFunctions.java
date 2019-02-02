package br.com.codenation.aceleradev.rec.loja.controller;

import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.model.User;

public interface StoreFunctions {
	
	public User findUser(String cpf) throws SQLException;

}
