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
  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  String resourceType();

  Optional<String> redirectUri();

  Optional<String> description();

  Optional<Code> language();

  String secret();

  Optional<String> name();

  static ImmutableClientApplication.ResourceTypeBuildStage builder() {
    return ImmutableClientApplication.builder();
  }
}
