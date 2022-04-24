package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Double> doseNumberPositiveInt();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<code> language();

  Optional<dateTime> date();

  Optional<List<ResourceList>> contained();

  CodeableConcept targetDisease();

  Optional<Double> seriesDosesPositiveInt();

  Optional<id> id();

  Reference patient();

  Optional<String> description();

  Optional<code> status();

  Optional<List<CodeableConcept>> doseStatusReason();

  Optional<String> doseNumberString();

  CodeableConcept doseStatus();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Reference> authority();

  Reference immunizationEvent();

  Optional<Meta> meta();

  Optional<String> series();

  Optional<String> seriesDosesString();

  Optional<List<Identifier>> identifier();

  static ImmutableImmunizationEvaluation.TargetDiseaseBuildStage builder() {
    return ImmutableImmunizationEvaluation.builder();
  }
}
