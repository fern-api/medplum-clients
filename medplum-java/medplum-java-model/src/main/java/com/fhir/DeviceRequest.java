package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDeviceRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceRequest {
  Optional<Period> occurrencePeriod();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> codeReference();

  Optional<CodeableConcept> codeCodeableConcept();

  Optional<List<Reference>> insurance();

  Optional<Identifier> groupIdentifier();

  Optional<Reference> performer();

  Optional<dateTime> authoredOn();

  Optional<CodeableConcept> performerType();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Reference> encounter();

  Optional<Reference> requester();

  Optional<code> language();

  Optional<code> intent();

  Optional<List<Reference>> basedOn();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<List<DeviceRequest_Parameter>> parameter();

  Optional<Narrative> text();

  Optional<List<Reference>> priorRequest();

  Optional<code> status();

  Optional<Meta> meta();

  Optional<code> priority();

  Reference subject();

  Optional<List<uri>> instantiatesUri();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> supportingInfo();

  Optional<String> occurrenceDateTime();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> relevantHistory();

  Optional<uri> implicitRules();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<Timing> occurrenceTiming();

  Optional<List<Reference>> reasonReference();

  static ImmutableDeviceRequest.ResourceTypeBuildStage builder() {
    return ImmutableDeviceRequest.builder();
  }
}
