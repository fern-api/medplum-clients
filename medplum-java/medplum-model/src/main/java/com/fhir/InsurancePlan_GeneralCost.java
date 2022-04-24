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
    as = ImmutableInsurancePlan_GeneralCost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_GeneralCost {
  Optional<positiveInt> groupSize();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<String> comment();

  Optional<Money> cost();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_GeneralCost.Builder builder() {
    return ImmutableInsurancePlan_GeneralCost.builder();
  }
}
