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
  Ratio presentation();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Ratio> concentrationLowLimit();

  Optional<String> measurementPoint();

  Optional<Ratio> concentration();

  Optional<List<CodeableConcept>> country();

  Optional<List<Extension>> extension();

  Optional<List<MedicinalProductIngredient_ReferenceStrength>> referenceStrength();

  Optional<Ratio> presentationLowLimit();

  static ImmutableMedicinalProductIngredient_Strength.PresentationBuildStage builder() {
    return ImmutableMedicinalProductIngredient_Strength.builder();
  }
}
