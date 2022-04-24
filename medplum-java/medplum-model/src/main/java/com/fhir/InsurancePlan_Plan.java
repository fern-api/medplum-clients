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
    as = ImmutableInsurancePlan_Plan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Plan {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<InsurancePlan_SpecificCost>> specificCost();

  Optional<List<Reference>> network();

  Optional<CodeableConcept> type();

  Optional<List<Reference>> coverageArea();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<List<InsurancePlan_GeneralCost>> generalCost();

  static ImmutableInsurancePlan_Plan.Builder builder() {
    return ImmutableInsurancePlan_Plan.builder();
  }
}
