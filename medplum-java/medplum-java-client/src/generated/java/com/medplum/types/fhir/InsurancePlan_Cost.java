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
    as = ImmutableInsurancePlan_Cost.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface InsurancePlan_Cost {
  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> value();

  Optional<CodeableConcept> applicability();

  Optional<List<CodeableConcept>> qualifiers();

  Optional<List<Extension>> extension();

  Optional<String> id();

  CodeableConcept type();

  static ImmutableInsurancePlan_Cost.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Cost.builder();
  }
}
