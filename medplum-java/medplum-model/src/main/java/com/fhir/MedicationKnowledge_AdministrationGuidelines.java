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
    as = ImmutableMedicationKnowledge_AdministrationGuidelines.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_AdministrationGuidelines {
  Optional<List<MedicationKnowledge_Dosage>> dosage();

  Optional<List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics();

  Optional<Reference> indicationReference();

  Optional<CodeableConcept> indicationCodeableConcept();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableMedicationKnowledge_AdministrationGuidelines.Builder builder() {
    return ImmutableMedicationKnowledge_AdministrationGuidelines.builder();
  }
}
