package com.redhat.developers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/fr-idf")
@RegisterRestClient
@ClientHeaderParam(name = "Authorization", value = "e7c6bb5a-5aaa-40f8-bf6f-d7e03fc94fa3")
public interface SncfService {

    // get rer A informations
    @GET
    @Path("/physical_modes/physical_mode:RapidTransit/lines/line:IDFM:C01742/departures")
    @Produces(MediaType.APPLICATION_JSON)
    SncfTraffic getRerATraffic();

}