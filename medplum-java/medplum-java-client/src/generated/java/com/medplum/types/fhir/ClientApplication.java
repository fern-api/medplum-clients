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
  String resourceType();

  Optional<String> description();

  Optional<Uri> implicitRules();

  String secret();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<Id> id();

  Optional<Code> language();

  Optional<String> redirectUri();

  static ImmutableClientApplication.ResourceTypeBuildStage builder() {
    return ImmutableClientApplication.builder();
  }
}
