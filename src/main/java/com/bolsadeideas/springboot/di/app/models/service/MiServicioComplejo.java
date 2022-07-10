package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioPrincipal")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante complicado...";
	}

}
