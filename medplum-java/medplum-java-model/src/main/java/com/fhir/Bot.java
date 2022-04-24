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
    as = ImmutableBot.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bot {
  Optional<String> name();

  Optional<String> resourceType();

  Optional<uri> implicitRules();

  Optional<String> runtimeVersion();

  Optional<String> description();

  Optional<Meta> meta();

  Optional<id> id();

  Optional<Attachment> photo();

  Optional<Boolean> runAsUser();

  Optional<code> language();

  Optional<String> code();

  static ImmutableBot.Builder builder() {
    return ImmutableBot.builder();
  }
}
