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
  Optional<String> id();

  Optional<List<CodeableConcept>> qualifiers();

  CodeableConcept type();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> applicability();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> value();

  static ImmutableInsurancePlan_Cost.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Cost.builder();
  }
}
