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
    as = ImmutableMedicationKnowledge_AdministrationGuidelines.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationKnowledge_AdministrationGuidelines {
  Optional<List<Extension>> modifierExtension();

  Optional<List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics();

  Optional<CodeableConcept> indicationCodeableConcept();

  Optional<Reference> indicationReference();

  Optional<List<MedicationKnowledge_Dosage>> dosage();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableMedicationKnowledge_AdministrationGuidelines.Builder builder() {
    return ImmutableMedicationKnowledge_AdministrationGuidelines.builder();
  }
}
