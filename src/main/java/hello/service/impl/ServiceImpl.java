package hello.service.impl;

import hello.dto.Walmart;
import hello.service.Service;

public class ServiceImpl implements Service {

	@Override
	public Walmart getInformacion() {
		Walmart walmart = new Walmart();
		walmart.setPais("MEX");
		walmart.setOficina("Azcapotzalco");
		walmart.setInformacion("POC");
		return walmart;
	}

}
