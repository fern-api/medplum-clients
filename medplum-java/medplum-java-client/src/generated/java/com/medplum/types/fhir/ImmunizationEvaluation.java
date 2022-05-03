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
  Optional<Code> language();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Code> status();

  Optional<String> description();

  Optional<String> doseNumberString();

  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<String> seriesDosesString();

  Optional<Reference> authority();

  CodeableConcept targetDisease();

  CodeableConcept doseStatus();

  Optional<List<CodeableConcept>> doseStatusReason();

  Optional<Uri> implicitRules();

  Optional<Double> seriesDosesPositiveInt();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Double> doseNumberPositiveInt();

  Reference patient();

  Reference immunizationEvent();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<String> series();

  static ImmutableImmunizationEvaluation.TargetDiseaseBuildStage builder() {
    return ImmutableImmunizationEvaluation.builder();
  }
}
