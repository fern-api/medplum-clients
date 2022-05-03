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
  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> hasMember();

  Optional<Range> valueRange();

  Optional<Reference> subject();

  Optional<List<Reference>> performer();

  Optional<List<Extension>> modifierExtension();

  Optional<Ratio> valueRatio();

  Optional<List<Extension>> extension();

  Optional<String> effectiveInstant();

  Optional<Code> language();

  Optional<Reference> specimen();

  Optional<Timing> effectiveTiming();

  String resourceType();

  Optional<List<Observation_Component>> component();

  Optional<CodeableConcept> method();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> derivedFrom();

  Optional<Instant> issued();

  Optional<List<Reference>> focus();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Boolean> valueBoolean();

  Optional<Period> effectivePeriod();

  Optional<List<Annotation>> note();

  Optional<List<ResourceList>> contained();

  Optional<String> effectiveDateTime();

  Optional<String> valueString();

  Optional<Reference> device();

  Optional<Period> valuePeriod();

  Optional<Reference> encounter();

  Optional<CodeableConcept> valueCodeableConcept();

  Optional<String> valueDateTime();

  Optional<ObservationStatus> status();

  CodeableConcept code();

  Optional<Double> valueInteger();

  Optional<List<CodeableConcept>> interpretation();

  Optional<List<Observation_ReferenceRange>> referenceRange();

  Optional<Narrative> text();

  Optional<SampledData> valueSampledData();

  Optional<CodeableConcept> bodySite();

  Optional<Quantity> valueQuantity();

  Optional<List<Reference>> basedOn();

  Optional<String> valueTime();

  static ImmutableObservation.ResourceTypeBuildStage builder() {
    return ImmutableObservation.builder();
  }
}
