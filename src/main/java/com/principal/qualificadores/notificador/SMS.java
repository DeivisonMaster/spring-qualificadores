package com.principal.qualificadores.notificador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.principal.qualificadores.model.Mensagem;

@Qualifier("urgente")
@Component
public class SMS implements Notificador{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("Mensagem por SMS: " + mensagem);
	}

}
