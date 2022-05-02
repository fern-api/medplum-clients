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
  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<List<Reference>> reasonReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<Reference>> partOf();

  Optional<Reference> context();

  Optional<Code> status();

  Optional<Code> language();

  Optional<Reference> request();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Id> id();

  Optional<List<MedicationAdministration_Performer>> performer();

  Optional<List<Reference>> eventHistory();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> supportingInformation();

  Optional<String> effectiveDateTime();

  Optional<List<ResourceList>> contained();

  Optional<List<Uri>> instantiates();

  Optional<MedicationAdministration_Dosage> dosage();

  Optional<Uri> implicitRules();

  Reference subject();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<Identifier>> identifier();

  Optional<Period> effectivePeriod();

  Optional<List<Reference>> device();

  Optional<Reference> medicationReference();

  static ImmutableMedicationAdministration.ResourceTypeBuildStage builder() {
    return ImmutableMedicationAdministration.builder();
  }
}
