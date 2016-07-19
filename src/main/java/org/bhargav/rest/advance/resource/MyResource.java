package org.bhargav.rest.advance.resource;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {

	@GET
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
	public Date test()
	{
		return Calendar.getInstance().getTime();
	}
}
