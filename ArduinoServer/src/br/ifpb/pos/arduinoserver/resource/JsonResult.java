package br.ifpb.pos.arduinoserver.resource;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonResult extends JSONObject {

	public JsonResult() {
		setMessage("Data not entered correctly!");
		setSuccess(false);
	}

	public void setMessage(String msg) {
		try {
			put("message", msg);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public void setSuccess(boolean s) {
		try {
			put("success", s);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public void setData(JSONObject json) {
		try {
			put("data", json);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
