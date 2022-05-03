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
  Optional<List<Uri>> instantiatesUri();

  Optional<Id> id();

  Optional<List<Reference>> priorRequest();

  Optional<CodeableConcept> codeCodeableConcept();

  Optional<Reference> encounter();

  Optional<List<Canonical>> instantiatesCanonical();

  String resourceType();

  Optional<Reference> requester();

  Optional<Code> priority();

  Optional<CodeableConcept> performerType();

  Optional<List<Extension>> extension();

  Optional<Timing> occurrenceTiming();

  Optional<Code> intent();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Code> status();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> basedOn();

  Optional<List<Identifier>> identifier();

  Optional<Period> occurrencePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> reasonReference();

  Optional<List<DeviceRequest_Parameter>> parameter();

  Reference subject();

  Optional<Identifier> groupIdentifier();

  Optional<List<Reference>> insurance();

  Optional<Meta> meta();

  Optional<Reference> codeReference();

  Optional<DateTime> authoredOn();

  Optional<Reference> performer();

  Optional<List<Reference>> supportingInfo();

  Optional<Code> language();

  Optional<String> occurrenceDateTime();

  Optional<List<Annotation>> note();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> relevantHistory();

  static ImmutableDeviceRequest.ResourceTypeBuildStage builder() {
    return ImmutableDeviceRequest.builder();
  }
}
