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
    as = ImmutableMedicationKnowledge_PatientCharacteristics.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_PatientCharacteristics {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Quantity> characteristicQuantity();

  Optional<List<String>> value();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> characteristicCodeableConcept();

  static ImmutableMedicationKnowledge_PatientCharacteristics.Builder builder() {
    return ImmutableMedicationKnowledge_PatientCharacteristics.builder();
  }
}
