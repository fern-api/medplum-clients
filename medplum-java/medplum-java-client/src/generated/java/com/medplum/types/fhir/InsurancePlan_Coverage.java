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
    as = ImmutableInsurancePlan_Coverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Coverage {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> network();

  Optional<String> id();

  List<InsurancePlan_Benefit> benefit();

  CodeableConcept type();

  static ImmutableInsurancePlan_Coverage.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Coverage.builder();
  }
}
