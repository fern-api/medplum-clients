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
  Optional<Id> id();

  Optional<List<Reference>> reasonReference();

  Optional<Uri> implicitRules();

  Optional<Reference> informationSource();

  Optional<List<Identifier>> identifier();

  Optional<Reference> context();

  Optional<DateTime> dateAsserted();

  Optional<List<Reference>> basedOn();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<Code> language();

  Optional<List<CodeableConcept>> statusReason();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> partOf();

  Reference subject();

  Optional<Reference> medicationReference();

  Optional<List<Reference>> derivedFrom();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<CodeableConcept> category();

  Optional<Period> effectivePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  Optional<String> effectiveDateTime();

  Optional<List<Extension>> extension();

  Optional<List<Dosage>> dosage();

  static ImmutableMedicationStatement.ResourceTypeBuildStage builder() {
    return ImmutableMedicationStatement.builder();
  }
}
