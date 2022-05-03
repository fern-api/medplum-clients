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
  Optional<Code> priority();

  String resourceType();

  Optional<List<Reference>> insurance();

  Optional<List<Reference>> relevantHistory();

  Optional<Timing> occurrenceTiming();

  Optional<List<Canonical>> instantiatesCanonical();

  Reference subject();

  Optional<List<DeviceRequest_Parameter>> parameter();

  Optional<CodeableConcept> performerType();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<Reference>> reasonReference();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<DateTime> authoredOn();

  Optional<Reference> requester();

  Optional<Reference> codeReference();

  Optional<Meta> meta();

  Optional<Reference> performer();

  Optional<List<Reference>> supportingInfo();

  Optional<Code> intent();

  Optional<Code> status();

  Optional<String> occurrenceDateTime();

  Optional<Code> language();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> basedOn();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> priorRequest();

  Optional<List<ResourceList>> contained();

  Optional<Period> occurrencePeriod();

  Optional<CodeableConcept> codeCodeableConcept();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Reference> encounter();

  static ImmutableDeviceRequest.ResourceTypeBuildStage builder() {
    return ImmutableDeviceRequest.builder();
  }
}
