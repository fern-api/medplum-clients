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
  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Dosage>> dosage();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Reference subject();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<Identifier>> identifier();

  Optional<Reference> context();

  Optional<Code> status();

  Optional<CodeableConcept> category();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> derivedFrom();

  Optional<String> effectiveDateTime();

  Optional<List<Reference>> reasonReference();

  Optional<Code> language();

  Optional<Reference> informationSource();

  Optional<List<Reference>> partOf();

  Optional<Period> effectivePeriod();

  Optional<DateTime> dateAsserted();

  Optional<Narrative> text();

  Optional<List<Reference>> basedOn();

  Optional<List<CodeableConcept>> statusReason();

  Optional<Reference> medicationReference();

  static ImmutableMedicationStatement.ResourceTypeBuildStage builder() {
    return ImmutableMedicationStatement.builder();
  }
}
