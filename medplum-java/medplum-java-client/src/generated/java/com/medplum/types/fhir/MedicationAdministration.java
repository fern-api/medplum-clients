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
  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> category();

  Optional<List<Reference>> reasonReference();

  Optional<List<Uri>> instantiates();

  Optional<List<Reference>> supportingInformation();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<Reference>> eventHistory();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<ResourceList>> contained();

  Optional<MedicationAdministration_Dosage> dosage();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<Period> effectivePeriod();

  Optional<Reference> medicationReference();

  Optional<List<Identifier>> identifier();

  Optional<Code> status();

  String resourceType();

  Optional<List<MedicationAdministration_Performer>> performer();

  Optional<Uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  Optional<String> effectiveDateTime();

  Optional<Code> language();

  Optional<Reference> request();

  Reference subject();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> device();

  Optional<Reference> context();

  static ImmutableMedicationAdministration.ResourceTypeBuildStage builder() {
    return ImmutableMedicationAdministration.builder();
  }
}
