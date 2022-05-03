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
    as = ImmutableMedicinalProductIngredient_Strength.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient_Strength {
  Optional<List<CodeableConcept>> country();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Ratio> concentration();

  Ratio presentation();

  Optional<String> id();

  Optional<String> measurementPoint();

  Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength();

  Optional<Ratio> presentationLowLimit();

  Optional<Ratio> concentrationLowLimit();

  static ImmutableMedicinalProductIngredient_Strength.PresentationBuildStage builder() {
    return ImmutableMedicinalProductIngredient_Strength.builder();
  }
}
