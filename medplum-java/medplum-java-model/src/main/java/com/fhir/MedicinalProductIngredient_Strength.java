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
    as = ImmutableMedicinalProductIngredient_Strength.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient_Strength {
  Ratio presentation();

  Optional<Ratio> presentationLowLimit();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Ratio> concentration();

  Optional<String> measurementPoint();

  Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength();

  Optional<Ratio> concentrationLowLimit();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> country();

  static ImmutableMedicinalProductIngredient_Strength.PresentationBuildStage builder() {
    return ImmutableMedicinalProductIngredient_Strength.builder();
  }
}
