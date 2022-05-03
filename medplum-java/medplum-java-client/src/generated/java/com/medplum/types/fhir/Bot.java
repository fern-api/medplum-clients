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
    as = ImmutableBot.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bot {
  Optional<String> resourceType();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<String> runtimeVersion();

  Optional<Uri> implicitRules();

  Optional<String> description();

  Optional<String> name();

  Optional<String> code();

  Optional<Boolean> runAsUser();

  Optional<Attachment> photo();

  static ImmutableBot.Builder builder() {
    return ImmutableBot.builder();
  }
}
