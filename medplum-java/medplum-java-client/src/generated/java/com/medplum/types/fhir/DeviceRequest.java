package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Reference> requester();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> insurance();

  Optional<Code> intent();

  Optional<String> occurrenceDateTime();

  Optional<Identifier> groupIdentifier();

  Optional<List<Reference>> supportingInfo();

  Optional<CodeableConcept> performerType();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> priorRequest();

  String resourceType();

  Optional<DateTime> authoredOn();

  Optional<Id> id();

  Reference subject();

  Optional<Reference> performer();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> priority();

  Optional<Meta> meta();

  Optional<Reference> codeReference();

  Optional<Period> occurrencePeriod();

  Optional<List<Reference>> relevantHistory();

  Optional<List<Extension>> extension();

  Optional<Reference> encounter();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> reasonReference();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Timing> occurrenceTiming();

  Optional<CodeableConcept> codeCodeableConcept();

  Optional<Code> language();

  Optional<List<DeviceRequest_Parameter>> parameter();

  Optional<Code> status();

  Optional<List<Annotation>> note();

  static ImmutableDeviceRequest.ResourceTypeBuildStage builder() {
    return ImmutableDeviceRequest.builder();
  }
}
