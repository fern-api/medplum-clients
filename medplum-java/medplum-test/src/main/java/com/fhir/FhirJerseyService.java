package com.fhir;

import com.palantir.tokens.auth.AuthHeader;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
public interface FhirJerseyService {

    @GET
    @Path("/fhir/R4/{resourceType}/{id}")
    ResourceList readResource(
            @HeaderParam("Authorization") AuthHeader authHeader,
            @PathParam("resourceType") String resourceType,
            @PathParam("id") String id);
}
