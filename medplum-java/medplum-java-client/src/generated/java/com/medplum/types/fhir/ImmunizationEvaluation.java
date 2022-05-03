package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImmunizationEvaluation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImmunizationEvaluation {
  Optional<Double> seriesDosesPositiveInt();

  Reference patient();

  String resourceType();

  Optional<String> seriesDosesString();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> doseStatusReason();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Reference immunizationEvent();

  Optional<String> doseNumberString();

  Optional<Narrative> text();

  Optional<Id> id();

  CodeableConcept targetDisease();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  Optional<Reference> authority();

  CodeableConcept doseStatus();

  Optional<List<ResourceList>> contained();

  Optional<String> series();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  Optional<Double> doseNumberPositiveInt();

  static ImmutableImmunizationEvaluation.PatientBuildStage builder() {
    return ImmutableImmunizationEvaluation.builder();
  }
}
