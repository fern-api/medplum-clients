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
  CodeableConcept type();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> applicability();

  Optional<String> id();

  Optional<List<CodeableConcept>> qualifiers();

  Optional<Quantity> value();

  Optional<List<Extension>> extension();

  static ImmutableInsurancePlan_Cost.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Cost.builder();
  }
}
