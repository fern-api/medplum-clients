package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePasswordChangeRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PasswordChangeRequest {
  Optional<String> secret();

  Optional<Boolean> used();

  Optional<Reference> user();

  Optional<String> resourceType();

  Optional<uri> implicitRules();

  Optional<code> language();

  Optional<id> id();

  Optional<String> redirectUri();

  Optional<Meta> meta();

  static ImmutablePasswordChangeRequest.Builder builder() {
    return ImmutablePasswordChangeRequest.builder();
  }
}
