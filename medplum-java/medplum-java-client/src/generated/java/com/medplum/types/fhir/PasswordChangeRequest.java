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
  Optional<String> resourceType();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Reference> user();

  Optional<Boolean> used();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<String> secret();

  Optional<String> redirectUri();

  static ImmutablePasswordChangeRequest.Builder builder() {
    return ImmutablePasswordChangeRequest.builder();
  }
}
