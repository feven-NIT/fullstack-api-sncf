package com.redhat.developers;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/rerA")
public class SncfResource {

    @Inject
    @RestClient
    SncfService SncfService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SncfTraffic getFruitByName() {
        return SncfService.getRerATraffic();
    }


}