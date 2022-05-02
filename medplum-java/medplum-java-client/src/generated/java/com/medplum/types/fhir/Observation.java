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
  Optional<ObservationStatus> status();

  Optional<Reference> subject();

  Optional<Period> effectivePeriod();

  Optional<List<CodeableConcept>> interpretation();

  Optional<Id> id();

  Optional<List<Observation_Component>> component();

  Optional<SampledData> valueSampledData();

  Optional<Boolean> valueBoolean();

  Optional<List<Reference>> partOf();

  Optional<Range> valueRange();

  Optional<Reference> encounter();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<List<Reference>> hasMember();

  Optional<String> valueDateTime();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Reference> specimen();

  Optional<List<Reference>> focus();

  Optional<Meta> meta();

  Optional<Quantity> valueQuantity();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<String> valueString();

  Optional<Instant> issued();

  Optional<Ratio> valueRatio();

  Optional<List<Reference>> basedOn();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> derivedFrom();

  Optional<Timing> effectiveTiming();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> category();

  Optional<Uri> implicitRules();

  CodeableConcept code();

  Optional<String> effectiveDateTime();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> method();

  Optional<List<Reference>> performer();

  Optional<List<Extension>> extension();

  Optional<String> valueTime();

  Optional<Period> valuePeriod();

  Optional<Reference> device();

  Optional<List<ResourceList>> contained();

  Optional<String> effectiveInstant();

  Optional<Double> valueInteger();

  Optional<CodeableConcept> bodySite();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  static ImmutableObservation.ResourceTypeBuildStage builder() {
    return ImmutableObservation.builder();
  }
}
