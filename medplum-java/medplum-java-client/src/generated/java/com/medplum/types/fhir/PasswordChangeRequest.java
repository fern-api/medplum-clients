package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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

  Optional<Code> language();

  Optional<Boolean> used();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Reference> user();

  Optional<String> redirectUri();

  Optional<String> resourceType();

  static ImmutablePasswordChangeRequest.Builder builder() {
    return ImmutablePasswordChangeRequest.builder();
  }
}
