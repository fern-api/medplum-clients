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
    as = ImmutableMedicationKnowledge_PatientCharacteristics.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_PatientCharacteristics {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Quantity> characteristicQuantity();

  Optional<CodeableConcept> characteristicCodeableConcept();

  Optional<List<String>> value();

  Optional<String> id();

  static ImmutableMedicationKnowledge_PatientCharacteristics.Builder builder() {
    return ImmutableMedicationKnowledge_PatientCharacteristics.builder();
  }
}
