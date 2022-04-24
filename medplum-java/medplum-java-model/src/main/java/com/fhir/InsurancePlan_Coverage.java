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
    as = ImmutableInsurancePlan_Coverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Coverage {
  Optional<List<Extension>> modifierExtension();

  List<InsurancePlan_Benefit> benefit();

  CodeableConcept type();

  Optional<List<Reference>> network();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableInsurancePlan_Coverage.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Coverage.builder();
  }
}
