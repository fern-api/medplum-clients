package com.medplum.services.fhir;

import com.medplum.ObjectMappers;
import com.medplum.types.fhir.GetTokenResponse;
import feign.Feign;
import feign.form.FormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface Oauth2Service {
  @POST
  @Path("/oauth2/token")
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  @Produces(MediaType.APPLICATION_JSON)
  GetTokenResponse getToken(
          @FormParam("grant_type") String grant_type,
          @FormParam("client_id") String client_id,
          @FormParam("client_secret") String client_secret);

  static Oauth2Service getClient(String url) {
    return Feign.builder()
        .contract(new JAXRSContract())
        .decoder(new JacksonDecoder(ObjectMappers.JSON_MAPPER))
        .encoder(new FormEncoder())
        .target(Oauth2Service.class, url);
  }
}
