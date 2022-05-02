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
    as = ImmutableInsurancePlan_Benefit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Benefit {
  CodeableConcept type();

  Optional<String> requirement();

  Optional<String> id();

  Optional<List<InsurancePlan_Limit>> limit();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_Benefit.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Benefit.builder();
  }
}
