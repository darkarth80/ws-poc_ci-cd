package hello.service.impl;

import org.springframework.beans.factory.annotation.Value;

import hello.dto.Walmart;
import hello.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Value("${app.paises.default.pais}")
    private String pais;

    @Value("${app.paises.default.oficina}")
    private String oficina;

    @Value("${app.paises.default.informacion}")
    private String informacion;

	@Override
	public Walmart getInformacion() {
		Walmart walmart = new Walmart();
		walmart.setPais(pais);
		walmart.setOficina(oficina);
		walmart.setInformacion(informacion);
		return walmart;
	}

}
