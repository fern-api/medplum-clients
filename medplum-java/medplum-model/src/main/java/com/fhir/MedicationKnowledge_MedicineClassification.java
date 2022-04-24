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
    as = ImmutableMedicationKnowledge_MedicineClassification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_MedicineClassification {
  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<CodeableConcept>> classification();

  static ImmutableMedicationKnowledge_MedicineClassification.TypeBuildStage builder() {
    return ImmutableMedicationKnowledge_MedicineClassification.builder();
  }
}
