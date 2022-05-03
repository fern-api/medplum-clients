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
    as = ImmutableInsurancePlan_GeneralCost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_GeneralCost {
  Optional<List<Extension>> modifierExtension();

  Optional<Money> cost();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> groupSize();

  Optional<String> comment();

  Optional<CodeableConcept> type();

  Optional<String> id();

  static ImmutableInsurancePlan_GeneralCost.Builder builder() {
    return ImmutableInsurancePlan_GeneralCost.builder();
  }
}
