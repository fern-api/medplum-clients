package com.fhir;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
public interface FhirJerseyService {

    @GET
    @Path("/fhir/R4/{resourceType}/{id}")
    ResourceList readResource(
            @HeaderParam("Authorization") String authHeader,
            @PathParam("resourceType") String resourceType,
            @PathParam("id") String id);


    static FhirJerseyService getClient(String url) {
        return Feign.builder()
                .contract(new JAXRSContract())
                .decoder(new JacksonDecoder(ObjectMappers.CLIENT_OBJECT_MAPPER))
                .encoder(new JacksonEncoder(ObjectMappers.CLIENT_OBJECT_MAPPER))
                .target(FhirJerseyService.class, url);
    }
}
