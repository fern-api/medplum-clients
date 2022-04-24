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
    as = ImmutableMedicationAdministration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationAdministration {
  Optional<Reference> request();

  Optional<MedicationAdministration_Dosage> dosage();

  Optional<List<Extension>> extension();

  Optional<List<uri>> instantiates();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<uri> implicitRules();

  Optional<List<Reference>> partOf();

  Optional<code> language();

  Optional<code> status();

  Optional<id> id();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Reference> context();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> supportingInformation();

  Optional<Period> effectivePeriod();

  Optional<List<Reference>> eventHistory();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<Reference>> device();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> reasonReference();

  Optional<CodeableConcept> category();

  Reference subject();

  Optional<String> effectiveDateTime();

  String resourceType();

  Optional<List<MedicationAdministration_Performer>> performer();

  Optional<Reference> medicationReference();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  static ImmutableMedicationAdministration.SubjectBuildStage builder() {
    return ImmutableMedicationAdministration.builder();
  }
}
