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
    as = ImmutableCoverage_CostToBeneficiary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage_CostToBeneficiary {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<Money> valueMoney();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Quantity> valueQuantity();

  Optional<List<Coverage_Exception>> exception();

  static ImmutableCoverage_CostToBeneficiary.Builder builder() {
    return ImmutableCoverage_CostToBeneficiary.builder();
  }
}
