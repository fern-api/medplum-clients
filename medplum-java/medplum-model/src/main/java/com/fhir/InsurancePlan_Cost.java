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
    as = ImmutableInsurancePlan_Cost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Cost {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Quantity> value();

  CodeableConcept type();

  Optional<List<CodeableConcept>> qualifiers();

  Optional<CodeableConcept> applicability();

  Optional<List<Extension>> modifierExtension();

  static ImmutableInsurancePlan_Cost.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Cost.builder();
  }
}
