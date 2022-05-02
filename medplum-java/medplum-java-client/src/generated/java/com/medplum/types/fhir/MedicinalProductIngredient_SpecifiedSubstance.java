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
    as = ImmutableMedicinalProductIngredient_SpecifiedSubstance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient_SpecifiedSubstance {
  CodeableConcept group();

  Optional<String> id();

  CodeableConcept code();

  Optional<List<MedicinalProductIngredient_Strength>> strength();

  Optional<CodeableConcept> confidentiality();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableMedicinalProductIngredient_SpecifiedSubstance.GroupBuildStage builder() {
    return ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder();
  }
}
