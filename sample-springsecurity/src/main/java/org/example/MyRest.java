package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/myrest")
public class MyRest {

	@GET
	public String getWelcomeMsg() throws Exception {
		return "Test Rest Service !!!!";
	}

}
