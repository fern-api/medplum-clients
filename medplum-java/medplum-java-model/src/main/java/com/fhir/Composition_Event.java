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
    as = ImmutableComposition_Event.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_Event {
  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Reference>> detail();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> modifierExtension();

  static ImmutableComposition_Event.Builder builder() {
    return ImmutableComposition_Event.builder();
  }
}
