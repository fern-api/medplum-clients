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
    as = ImmutableMedicinalProductIngredient_ReferenceStrength.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient_ReferenceStrength {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<CodeableConcept>> country();

  Optional<String> measurementPoint();

  Optional<CodeableConcept> substance();

  Optional<List<Extension>> modifierExtension();

  Ratio strength();

  Optional<Ratio> strengthLowLimit();

  static ImmutableMedicinalProductIngredient_ReferenceStrength.StrengthBuildStage builder() {
    return ImmutableMedicinalProductIngredient_ReferenceStrength.builder();
  }
}
