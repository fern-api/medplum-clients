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
  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> requester();

  Optional<List<DeviceRequest_Parameter>> parameter();

  Optional<List<Reference>> supportingInfo();

  String resourceType();

  Optional<Code> intent();

  Optional<Timing> occurrenceTiming();

  Optional<DateTime> authoredOn();

  Optional<Code> status();

  Optional<List<Reference>> insurance();

  Optional<Id> id();

  Optional<List<Reference>> basedOn();

  Optional<Code> priority();

  Optional<Meta> meta();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> codeReference();

  Reference subject();

  Optional<CodeableConcept> performerType();

  Optional<List<Reference>> relevantHistory();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> performer();

  Optional<List<Reference>> priorRequest();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> codeCodeableConcept();

  Optional<Identifier> groupIdentifier();

  Optional<List<Annotation>> note();

  Optional<Reference> encounter();

  Optional<String> occurrenceDateTime();

  Optional<Period> occurrencePeriod();

  static ImmutableDeviceRequest.ResourceTypeBuildStage builder() {
    return ImmutableDeviceRequest.builder();
  }
}
