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
  Optional<Period> effectivePeriod();

  Optional<Meta> meta();

  Optional<List<Reference>> partOf();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> statusReason();

  String resourceType();

  Optional<List<Reference>> reasonReference();

  Optional<Narrative> text();

  Optional<List<Uri>> instantiates();

  Optional<Id> id();

  Optional<List<Reference>> eventHistory();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> request();

  Optional<String> effectiveDateTime();

  Optional<List<Extension>> extension();

  Optional<MedicationAdministration_Dosage> dosage();

  Optional<Uri> implicitRules();

  Optional<Code> status();

  Optional<List<MedicationAdministration_Performer>> performer();

  Optional<List<Reference>> supportingInformation();

  Optional<Reference> medicationReference();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Reference subject();

  Optional<CodeableConcept> category();

  Optional<Reference> context();

  Optional<List<Reference>> device();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicationAdministration.ResourceTypeBuildStage builder() {
    return ImmutableMedicationAdministration.builder();
  }
}
