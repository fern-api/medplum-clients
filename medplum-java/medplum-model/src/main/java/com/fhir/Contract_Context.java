package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> code();

  Optional<Reference> reference();

  Optional<String> id();

  static ImmutableContract_Context.Builder builder() {
    return ImmutableContract_Context.builder();
  }
}
