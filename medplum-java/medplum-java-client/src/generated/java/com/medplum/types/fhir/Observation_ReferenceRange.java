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
  Optional<Quantity> low();

  Optional<Quantity> high();

  Optional<List<CodeableConcept>> appliesTo();

  Optional<Range> age();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<String> text();

  Optional<List<Extension>> modifierExtension();

  static ImmutableObservation_ReferenceRange.Builder builder() {
    return ImmutableObservation_ReferenceRange.builder();
  }
}
