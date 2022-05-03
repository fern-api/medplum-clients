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
    as = ImmutableInsurancePlan_SpecificCost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_SpecificCost {
  Optional<List<InsurancePlan_Benefit1>> benefit();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept category();

  Optional<List<Extension>> extension();

  static ImmutableInsurancePlan_SpecificCost.CategoryBuildStage builder() {
    return ImmutableInsurancePlan_SpecificCost.builder();
  }
}
