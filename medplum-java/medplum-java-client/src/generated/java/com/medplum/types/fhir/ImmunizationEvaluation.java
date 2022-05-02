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
  Optional<Code> status();

  Reference patient();

  Optional<String> seriesDosesString();

  Optional<List<CodeableConcept>> doseStatusReason();

  Optional<Reference> authority();

  Optional<Uri> implicitRules();

  String resourceType();

  CodeableConcept targetDisease();

  Optional<Double> doseNumberPositiveInt();

  CodeableConcept doseStatus();

  Optional<Double> seriesDosesPositiveInt();

  Reference immunizationEvent();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> date();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<String> series();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<String> doseNumberString();

  static ImmutableImmunizationEvaluation.PatientBuildStage builder() {
    return ImmutableImmunizationEvaluation.builder();
  }
}
