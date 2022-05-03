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
  Optional<String> resourceType();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  String passwordHash();

  Optional<Boolean> admin();

  Optional<Id> id();

  Optional<Code> language();

  String email();

  static ImmutableUser.PasswordHashBuildStage builder() {
    return ImmutableUser.builder();
  }
}
