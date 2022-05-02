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
  Optional<CodeableConcept> characteristicCodeableConcept();

  Optional<String> id();

  Optional<Quantity> characteristicQuantity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> value();

  Optional<List<Extension>> extension();

  static ImmutableMedicationKnowledge_PatientCharacteristics.Builder builder() {
    return ImmutableMedicationKnowledge_PatientCharacteristics.builder();
  }
}
