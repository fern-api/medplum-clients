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
  Optional<String> id();

  CodeableConcept code();

  Optional<CodeableConcept> confidentiality();

  Optional<List<MedicinalProductIngredient_Strength>> strength();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept group();

  static ImmutableMedicinalProductIngredient_SpecifiedSubstance.CodeBuildStage builder() {
    return ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder();
  }
}
