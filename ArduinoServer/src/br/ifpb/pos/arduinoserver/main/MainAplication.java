package br.ifpb.pos.arduinoserver.main;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import br.ifpb.pos.arduinoserver.resource.TemperatureResource;

public class MainAplication extends Application {
	@Override
	public Restlet createInboundRoot() {
		Router router = new Router();
		
		//Obter temperature 
		router.attach("/temperature", TemperatureResource.class);
		
		
		return router;
	}

}