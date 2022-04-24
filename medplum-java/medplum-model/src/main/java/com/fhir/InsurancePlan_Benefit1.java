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
    as = ImmutableInsurancePlan_Benefit1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Benefit1 {
  CodeableConcept type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<InsurancePlan_Cost>> cost();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_Benefit1.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Benefit1.builder();
  }
}
