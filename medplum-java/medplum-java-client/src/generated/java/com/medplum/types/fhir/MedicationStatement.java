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
  Optional<List<Annotation>> note();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> statusReason();

  String resourceType();

  Optional<String> effectiveDateTime();

  Optional<List<Reference>> derivedFrom();

  Optional<List<Reference>> reasonReference();

  Optional<Meta> meta();

  Optional<Reference> medicationReference();

  Optional<List<Dosage>> dosage();

  Reference subject();

  Optional<Reference> context();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> partOf();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<Reference> informationSource();

  Optional<List<Reference>> basedOn();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Period> effectivePeriod();

  Optional<DateTime> dateAsserted();

  Optional<Code> status();

  static ImmutableMedicationStatement.ResourceTypeBuildStage builder() {
    return ImmutableMedicationStatement.builder();
  }
}
