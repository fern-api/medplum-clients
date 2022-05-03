package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableGetTokenResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GetTokenResponse {
  ProfileReference profile();

  ProjectReference project();

  String token_type();

  String access_token();

  int expires_in();

  static ImmutableGetTokenResponse.ProfileBuildStage builder() {
    return ImmutableGetTokenResponse.builder();
  }
}
