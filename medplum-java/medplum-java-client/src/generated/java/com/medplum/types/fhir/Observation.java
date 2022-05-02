package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<SampledData> valueSampledData();

  Optional<Reference> subject();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<List<Identifier>> identifier();

  Optional<Ratio> valueRatio();

  Optional<Reference> encounter();

  Optional<List<Reference>> performer();

  Optional<Reference> specimen();

  Optional<Period> valuePeriod();

  Optional<Timing> effectiveTiming();

  String resourceType();

  Optional<Meta> meta();

  Optional<String> effectiveInstant();

  Optional<String> valueTime();

  Optional<Period> effectivePeriod();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Instant> issued();

  Optional<ObservationStatus> status();

  CodeableConcept code();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> effectiveDateTime();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<CodeableConcept> method();

  Optional<List<Reference>> hasMember();

  Optional<Quantity> valueQuantity();

  Optional<List<CodeableConcept>> interpretation();

  Optional<String> valueDateTime();

  Optional<String> valueString();

  Optional<CodeableConcept> bodySite();

  Optional<Code> language();

  Optional<List<Observation_Component>> component();

  Optional<Range> valueRange();

  Optional<List<Reference>> focus();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> derivedFrom();

  Optional<List<CodeableConcept>> category();

  Optional<Reference> device();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> partOf();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> modifierExtension();

  static ImmutableObservation.ResourceTypeBuildStage builder() {
    return ImmutableObservation.builder();
  }
}
