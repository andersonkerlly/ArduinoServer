package br.ifpb.pos.arduinoserver.main;

import org.restlet.Component;
import org.restlet.data.Protocol;

import br.edu.ifpb.pos.arduinocomunication.ArduinoComunication;

public class Main {
	  
	  public static void main(String[] args) throws Exception {
	    Component component = new Component();
	    component.getServers().add(Protocol.HTTP, 8181);
	    component.getDefaultHost().attach(
	        "/TemperatureService", new MainAplication()
	    );
	    component.start();
	    ArduinoComunication.run();
	  }
	  
	}