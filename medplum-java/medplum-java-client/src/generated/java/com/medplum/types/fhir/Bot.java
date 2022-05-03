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
  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<String> resourceType();

  Optional<Boolean> runAsUser();

  Optional<Meta> meta();

  Optional<String> runtimeVersion();

  Optional<String> description();

  Optional<Code> language();

  Optional<Attachment> photo();

  Optional<String> code();

  Optional<Id> id();

  static ImmutableBot.Builder builder() {
    return ImmutableBot.builder();
  }
}
