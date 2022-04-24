package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableObservationDefinition_QuantitativeDetails.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ObservationDefinition_QuantitativeDetails {
  Optional<List<Extension>> modifierExtension();

  Optional<decimal> conversionFactor();

  Optional<CodeableConcept> customaryUnit();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> unit();

  Optional<String> id();

  Optional<Integer> decimalPrecision();

  static ImmutableObservationDefinition_QuantitativeDetails.Builder builder() {
    return ImmutableObservationDefinition_QuantitativeDetails.builder();
  }
}
