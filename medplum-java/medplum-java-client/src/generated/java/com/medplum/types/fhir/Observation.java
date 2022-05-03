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
  Optional<List<Reference>> focus();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> hasMember();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> derivedFrom();

  Optional<Period> valuePeriod();

  Optional<Code> language();

  Optional<String> effectiveInstant();

  Optional<Boolean> valueBoolean();

  Optional<ObservationStatus> status();

  Optional<String> valueString();

  Optional<Period> effectivePeriod();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<List<Reference>> basedOn();

  Optional<Reference> encounter();

  Optional<Reference> specimen();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<Reference> device();

  String resourceType();

  Optional<String> valueTime();

  Optional<SampledData> valueSampledData();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<List<Annotation>> note();

  Optional<Reference> subject();

  Optional<Uri> implicitRules();

  Optional<Double> valueInteger();

  Optional<Ratio> valueRatio();

  Optional<Instant> issued();

  Optional<String> valueDateTime();

  Optional<List<CodeableConcept>> interpretation();

  Optional<List<CodeableConcept>> category();

  Optional<List<Observation_Component>> component();

  Optional<Timing> effectiveTiming();

  Optional<CodeableConcept> bodySite();

  Optional<List<Reference>> partOf();

  Optional<CodeableConcept> method();

  Optional<Quantity> valueQuantity();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Narrative> text();

  CodeableConcept code();

  Optional<Range> valueRange();

  Optional<String> effectiveDateTime();

  Optional<List<Reference>> performer();

  static ImmutableObservation.ResourceTypeBuildStage builder() {
    return ImmutableObservation.builder();
  }
}
