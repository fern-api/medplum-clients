package com.medplum.services.fhir;

import com.medplum.AuthHeader;
import com.medplum.ObjectMappers;
import com.medplum.types.fhir.Bundle;
import com.medplum.types.fhir.ResourceList;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/")
public interface FhirService {
  @GET
  @Path("/fhir/R4/{resourceType}")
  Bundle search(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType);

  @POST
  @Path("/fhir/R4/{resourceType}")
  ResourceList createResource(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType, ResourceList request);

  @GET
  @Path("/fhir/R4/{resourceType}/{id}")
  ResourceList readResource(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType, @PathParam("id") String id);

  @PUT
  @Path("/fhir/R4/{resourceType}/{id}")
  ResourceList updateResource(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType, @PathParam("id") String id,
      ResourceList request);

  @DELETE
  @Path("/fhir/R4/{resourceType}/{id}")
  void deleteResource(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType, @PathParam("id") String id);

  @GET
  @Path("/fhir/R4/{resourceType}/{id}/_history")
  Bundle readResourceHistory(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType, @PathParam("id") String id);

  @GET
  @Path("/fhir/R4/{resourceType}/{id}/_history/{versionId}")
  ResourceList readVersion(@HeaderParam("Authorization") AuthHeader authHeader,
      @PathParam("resourceType") String resourceType, @PathParam("id") String id,
      @PathParam("versionId") String versionId);

  static FhirService getClient(String url) {
    return Feign.builder()
        .contract(new JAXRSContract())
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ObjectMappers.JSON_MAPPER))
        .target(FhirService.class, url);
  }
}
