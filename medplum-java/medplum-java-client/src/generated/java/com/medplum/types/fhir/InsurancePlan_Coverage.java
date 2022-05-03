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
  Optional<List<Reference>> network();

  List<InsurancePlan_Benefit> benefit();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_Coverage.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Coverage.builder();
  }
}
