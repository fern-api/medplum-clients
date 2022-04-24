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
    as = ImmutableMedicinalProductIngredient_SpecifiedSubstance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient_SpecifiedSubstance {
  Optional<List<MedicinalProductIngredient_Strength>> strength();

  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept group();

  Optional<CodeableConcept> confidentiality();

  static ImmutableMedicinalProductIngredient_SpecifiedSubstance.CodeBuildStage builder() {
    return ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder();
  }
}
