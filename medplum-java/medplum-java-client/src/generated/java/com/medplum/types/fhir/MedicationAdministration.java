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
    as = ImmutableMedicationAdministration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationAdministration {
  Optional<List<ResourceList>> contained();

  Optional<Reference> request();

  Optional<CodeableConcept> category();

  Optional<Narrative> text();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> eventHistory();

  Reference subject();

  Optional<Period> effectivePeriod();

  Optional<List<Extension>> extension();

  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<List<Uri>> instantiates();

  Optional<Reference> context();

  String resourceType();

  Optional<MedicationAdministration_Dosage> dosage();

  Optional<List<Reference>> partOf();

  Optional<String> effectiveDateTime();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Reference> medicationReference();

  Optional<Code> status();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<MedicationAdministration_Performer>> performer();

  Optional<List<Reference>> supportingInformation();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<Reference>> device();

  static ImmutableMedicationAdministration.SubjectBuildStage builder() {
    return ImmutableMedicationAdministration.builder();
  }
}
