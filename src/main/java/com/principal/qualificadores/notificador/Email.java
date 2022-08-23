package com.principal.qualificadores.notificador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.principal.qualificadores.model.Mensagem;

@Qualifier("importante")
@Component
public class Email implements Notificador{

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("Mensagem por e-mail: " + mensagem);
	}

}
