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
    as = ImmutableUser.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface User {
  String passwordHash();

  Optional<id> id();

  String email();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<code> language();

  Optional<String> resourceType();

  Optional<Boolean> admin();

  static ImmutableUser.PasswordHashBuildStage builder() {
    return ImmutableUser.builder();
  }
}
