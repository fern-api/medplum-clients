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
    as = ImmutableMedicinalProductIngredient_ReferenceStrength.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIngredient_ReferenceStrength {
  Optional<Ratio> strengthLowLimit();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<CodeableConcept>> country();

  Optional<CodeableConcept> substance();

  Optional<String> measurementPoint();

  Optional<List<Extension>> extension();

  Ratio strength();

  static ImmutableMedicinalProductIngredient_ReferenceStrength.StrengthBuildStage builder() {
    return ImmutableMedicinalProductIngredient_ReferenceStrength.builder();
  }
}
