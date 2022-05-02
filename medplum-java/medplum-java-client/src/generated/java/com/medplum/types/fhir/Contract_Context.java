package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableContract_Context.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Context {
  Optional<String> text();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Reference> reference();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> modifierExtension();

  static ImmutableContract_Context.Builder builder() {
    return ImmutableContract_Context.builder();
  }
}
