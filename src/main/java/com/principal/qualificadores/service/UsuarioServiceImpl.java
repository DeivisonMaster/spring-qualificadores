package com.principal.qualificadores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.principal.qualificadores.model.Mensagem;
import com.principal.qualificadores.model.Usuario;
import com.principal.qualificadores.notificador.Notificador;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
		
		notificador.notificar(new Mensagem("Cadastrado Realizado", "Feito"));
	}

}
