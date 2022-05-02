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
  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> high();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> appliesTo();

  Optional<Range> age();

  Optional<String> id();

  Optional<Quantity> low();

  Optional<String> text();

  static ImmutableObservation_ReferenceRange.Builder builder() {
    return ImmutableObservation_ReferenceRange.builder();
  }
}
