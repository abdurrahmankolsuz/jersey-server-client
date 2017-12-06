package com.sunn;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("")
public class RestResource {
	@Path(value="alarm")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Response getAlarm(Alarm alarm) {
		System.out.println(alarm.description);
		String result = "Alarm has been delivered: "+ alarm ;
		return Response.status(202).entity(alarm).build();
    }
    
	@Path(value="cuerequest")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
   	@Consumes(MediaType.APPLICATION_JSON)
    public Response getCuerequest(CueData cueData) {
    	
		System.out.println(cueData.epochTime);
		String result = "CueRequest has been delivered: " + cueData ;
		return Response.status(202).entity(cueData).build();
    }
}