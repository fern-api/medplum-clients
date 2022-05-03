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
    as = ImmutableMedicationStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationStatement {
  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> category();

  Optional<Reference> context();

  Reference subject();

  Optional<DateTime> dateAsserted();

  Optional<List<Reference>> derivedFrom();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<Reference>> partOf();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Dosage>> dosage();

  Optional<List<Annotation>> note();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Code> status();

  Optional<String> effectiveDateTime();

  Optional<Period> effectivePeriod();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> basedOn();

  Optional<Reference> medicationReference();

  Optional<Meta> meta();

  Optional<List<Reference>> reasonReference();

  Optional<Code> language();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> informationSource();

  String resourceType();

  static ImmutableMedicationStatement.SubjectBuildStage builder() {
    return ImmutableMedicationStatement.builder();
  }
}
