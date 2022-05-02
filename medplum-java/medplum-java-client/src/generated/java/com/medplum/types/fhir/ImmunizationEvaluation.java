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
  Optional<Uri> implicitRules();

  Optional<String> series();

  Optional<List<ResourceList>> contained();

  Optional<Reference> authority();

  Optional<String> description();

  Reference immunizationEvent();

  Optional<String> seriesDosesString();

  Optional<Double> doseNumberPositiveInt();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Code> status();

  Optional<Double> seriesDosesPositiveInt();

  Optional<DateTime> date();

  CodeableConcept doseStatus();

  Optional<List<CodeableConcept>> doseStatusReason();

  Optional<List<Extension>> modifierExtension();

  Optional<String> doseNumberString();

  Reference patient();

  CodeableConcept targetDisease();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Narrative> text();

  Optional<Code> language();

  static ImmutableImmunizationEvaluation.ImmunizationEventBuildStage builder() {
    return ImmutableImmunizationEvaluation.builder();
  }
}
