package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> customaryUnit();

  Optional<CodeableConcept> unit();

  Optional<Integer> decimalPrecision();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> conversionFactor();

  Optional<String> id();

  static ImmutableObservationDefinition_QuantitativeDetails.Builder builder() {
    return ImmutableObservationDefinition_QuantitativeDetails.builder();
  }
}
