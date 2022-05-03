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
  Optional<Integer> decimalPrecision();

  Optional<String> id();

  Optional<Decimal> conversionFactor();

  Optional<CodeableConcept> unit();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> customaryUnit();

  Optional<List<Extension>> extension();

  static ImmutableObservationDefinition_QuantitativeDetails.Builder builder() {
    return ImmutableObservationDefinition_QuantitativeDetails.builder();
  }
}
