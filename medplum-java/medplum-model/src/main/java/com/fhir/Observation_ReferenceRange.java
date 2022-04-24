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
    as = ImmutableObservation_ReferenceRange.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Observation_ReferenceRange {
  Optional<String> text();

  Optional<List<Extension>> extension();

  Optional<Quantity> low();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<Quantity> high();

  Optional<Range> age();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> appliesTo();

  static ImmutableObservation_ReferenceRange.Builder builder() {
    return ImmutableObservation_ReferenceRange.builder();
  }
}
