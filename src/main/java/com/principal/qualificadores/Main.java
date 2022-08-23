package com.principal.qualificadores;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.principal.qualificadores.model.Usuario;
import com.principal.qualificadores.service.UsuarioService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext config = 
				new AnnotationConfigApplicationContext(Main.class.getPackage().getName());
		
		UsuarioService service = config.getBean(UsuarioService.class);
		Usuario usuario = new Usuario("Deivison");
		service.cadastrar(usuario);
		
		config.close();
	}
}
