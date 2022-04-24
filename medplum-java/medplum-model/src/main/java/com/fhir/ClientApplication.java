package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<String> name();

  String resourceType();

  Optional<code> language();

  Optional<uri> implicitRules();

  Optional<id> id();

  String secret();

  Optional<String> redirectUri();

  Optional<String> description();

  static ImmutableClientApplication.ResourceTypeBuildStage builder() {
    return ImmutableClientApplication.builder();
  }
}
