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
    as = ImmutableCoverage_CostToBeneficiary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage_CostToBeneficiary {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Money> valueMoney();

  Optional<List<Coverage_Exception>> exception();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Quantity> valueQuantity();

  static ImmutableCoverage_CostToBeneficiary.Builder builder() {
    return ImmutableCoverage_CostToBeneficiary.builder();
  }
}
