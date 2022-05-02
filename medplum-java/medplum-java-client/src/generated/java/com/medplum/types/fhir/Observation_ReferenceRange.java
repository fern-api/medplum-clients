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
    as = ImmutableObservation_ReferenceRange.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Observation_ReferenceRange {
  Optional<Range> age();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> appliesTo();

  Optional<String> text();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<Quantity> high();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> low();

  static ImmutableObservation_ReferenceRange.Builder builder() {
    return ImmutableObservation_ReferenceRange.builder();
  }
}
