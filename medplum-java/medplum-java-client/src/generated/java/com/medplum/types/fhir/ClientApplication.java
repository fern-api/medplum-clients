package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableClientApplication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClientApplication {
  Optional<String> redirectUri();

  Optional<Meta> meta();

  String resourceType();

  Optional<Id> id();

  Optional<String> description();

  Optional<String> name();

  String secret();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  static ImmutableClientApplication.ResourceTypeBuildStage builder() {
    return ImmutableClientApplication.builder();
  }
}
