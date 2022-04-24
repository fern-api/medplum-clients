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
    as = ImmutableInsurancePlan_SpecificCost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_SpecificCost {
  Optional<List<InsurancePlan_Benefit1>> benefit();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept category();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_SpecificCost.CategoryBuildStage builder() {
    return ImmutableInsurancePlan_SpecificCost.builder();
  }
}
