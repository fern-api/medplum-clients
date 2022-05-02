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
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> qualifiers();

  Optional<Quantity> value();

  Optional<String> id();

  CodeableConcept type();

  Optional<CodeableConcept> applicability();

  static ImmutableInsurancePlan_Cost.TypeBuildStage builder() {
    return ImmutableInsurancePlan_Cost.builder();
  }
}
