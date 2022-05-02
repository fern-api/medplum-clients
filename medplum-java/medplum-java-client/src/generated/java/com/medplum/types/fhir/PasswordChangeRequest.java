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
  Optional<Boolean> used();

  Optional<String> redirectUri();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<String> resourceType();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Reference> user();

  Optional<String> secret();

  static ImmutablePasswordChangeRequest.Builder builder() {
    return ImmutablePasswordChangeRequest.builder();
  }
}
