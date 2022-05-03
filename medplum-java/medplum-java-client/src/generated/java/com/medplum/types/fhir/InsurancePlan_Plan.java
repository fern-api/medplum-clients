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
    as = ImmutableInsurancePlan_Plan.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Plan {
  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Reference>> network();

  Optional<List<InsurancePlan_GeneralCost>> generalCost();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> coverageArea();

  Optional<List<Identifier>> identifier();

  Optional<List<InsurancePlan_SpecificCost>> specificCost();

  static ImmutableInsurancePlan_Plan.Builder builder() {
    return ImmutableInsurancePlan_Plan.builder();
  }
}
