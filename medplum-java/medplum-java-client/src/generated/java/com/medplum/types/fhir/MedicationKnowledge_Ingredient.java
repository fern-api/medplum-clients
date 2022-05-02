package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMedicationKnowledge_Ingredient.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_Ingredient {
  Optional<CodeableConcept> itemCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Reference> itemReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> isActive();

  Optional<Ratio> strength();

  static ImmutableMedicationKnowledge_Ingredient.Builder builder() {
    return ImmutableMedicationKnowledge_Ingredient.builder();
  }
}
