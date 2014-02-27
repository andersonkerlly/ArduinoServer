package br.ifpb.pos.arduinoserver.resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import br.edu.ifpb.pos.arduinocomunication.ArduinoComunication;

public class TemperatureResource extends ServerResource {
	@Get
	public JsonRepresentation getTemperature() {
		JSONObject jsonObject = new JSONObject();
		JsonResult jsonResult = new JsonResult();

		try {
			
			jsonObject.put("temperature", ArduinoComunication.getTemperature());
            System.out.println(ArduinoComunication.temperature);
			jsonResult.setData(jsonObject);
			jsonResult.setSuccess(true);
			jsonResult.setMessage("Temperature successfully added");

		} catch (JSONException e) {
			jsonResult.setData(jsonObject);
			jsonResult.setSuccess(false);
			jsonResult.setMessage("Temperature not found");
		}
		return new JsonRepresentation(jsonObject);
	}

}
