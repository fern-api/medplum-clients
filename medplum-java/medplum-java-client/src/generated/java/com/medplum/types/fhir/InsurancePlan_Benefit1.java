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
    as = ImmutableInsurancePlan_Benefit1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Benefit1 {
  Optional<List<Extension>> extension();

  Optional<List<InsurancePlan_Cost>> cost();

  CodeableConcept type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_Benefit1.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Benefit1.builder();
  }
}
