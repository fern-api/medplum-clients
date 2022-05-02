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
  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> country();

  Ratio strength();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> substance();

  Optional<String> measurementPoint();

  Optional<String> id();

  Optional<Ratio> strengthLowLimit();

  static ImmutableMedicinalProductIngredient_ReferenceStrength.StrengthBuildStage builder() {
    return ImmutableMedicinalProductIngredient_ReferenceStrength.builder();
  }
}
