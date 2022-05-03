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
    as = ImmutableUser.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface User {
  Optional<Uri> implicitRules();

  Optional<Boolean> admin();

  String email();

  Optional<String> resourceType();

  String passwordHash();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Meta> meta();

  static ImmutableUser.EmailBuildStage builder() {
    return ImmutableUser.builder();
  }
}
