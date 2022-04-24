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
    as = ImmutableMedicationStatement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicationStatement {
  Optional<Period> effectivePeriod();

  Optional<List<Reference>> partOf();

  Optional<code> status();

  Optional<id> id();

  Optional<String> effectiveDateTime();

  Optional<code> language();

  Reference subject();

  Optional<Reference> context();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> basedOn();

  Optional<List<Annotation>> note();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Reference> medicationReference();

  Optional<Reference> informationSource();

  Optional<List<CodeableConcept>> statusReason();

  Optional<uri> implicitRules();

  Optional<List<Reference>> reasonReference();

  Optional<CodeableConcept> category();

  Optional<dateTime> dateAsserted();

  Optional<List<Extension>> extension();

  Optional<List<Dosage>> dosage();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> medicationCodeableConcept();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Reference>> derivedFrom();

  Optional<List<Identifier>> identifier();

  static ImmutableMedicationStatement.SubjectBuildStage builder() {
    return ImmutableMedicationStatement.builder();
  }
}
