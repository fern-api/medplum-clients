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
    as = ImmutableInsurancePlan_Benefit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Benefit {
  Optional<List<Extension>> modifierExtension();

  Optional<String> requirement();

  Optional<List<InsurancePlan_Limit>> limit();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  static ImmutableInsurancePlan_Benefit.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Benefit.builder();
  }
}
