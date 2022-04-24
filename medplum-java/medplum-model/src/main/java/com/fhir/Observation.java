package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableObservation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Observation {
  Optional<List<Reference>> performer();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueTime();

  Optional<Reference> device();

  Optional<List<Reference>> hasMember();

  Optional<Quantity> valueQuantity();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> bodySite();

  Optional<String> valueDateTime();

  Optional<SampledData> valueSampledData();

  Optional<List<Reference>> basedOn();

  Optional<instant> issued();

  Optional<Period> valuePeriod();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<String> effectiveDateTime();

  Optional<Period> effectivePeriod();

  Optional<id> id();

  Optional<List<Observation_Component>> component();

  Optional<Reference> encounter();

  Optional<Double> valueInteger();

  Optional<Narrative> text();

  Optional<ObservationStatus> status();

  Optional<CodeableConcept> method();

  Optional<Range> valueRange();

  CodeableConcept code();

  Optional<List<Reference>> derivedFrom();

  Optional<List<Reference>> focus();

  Optional<String> effectiveInstant();

  Optional<Timing> effectiveTiming();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<List<Reference>> partOf();

  Optional<String> valueString();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<Ratio> valueRatio();

  Optional<CodeableConcept> dataAbsentReason();

  String resourceType();

  Optional<Reference> subject();

  Optional<List<CodeableConcept>> interpretation();

  Optional<List<Annotation>> note();

  Optional<code> language();

  Optional<Boolean> valueBoolean();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Reference> specimen();

  Optional<List<CodeableConcept>> category();

  static ImmutableObservation.CodeBuildStage builder() {
    return ImmutableObservation.builder();
  }
}
