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
    as = ImmutableComposition_Event.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Composition_Event {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> detail();

  Optional<String> id();

  Optional<List<CodeableConcept>> code();

  Optional<Period> period();

  static ImmutableComposition_Event.Builder builder() {
    return ImmutableComposition_Event.builder();
  }
}
