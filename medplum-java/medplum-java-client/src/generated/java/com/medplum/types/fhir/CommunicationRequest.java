package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCommunicationRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CommunicationRequest {
  Optional<List<Reference>> replaces();

  Optional<Period> occurrencePeriod();

  Optional<List<Reference>> recipient();

  Optional<Narrative> text();

  Optional<List<Reference>> basedOn();

  Optional<Code> status();

  Optional<Code> language();

  Optional<List<Reference>> about();

  Optional<String> occurrenceDateTime();

  Optional<List<ResourceList>> contained();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Reference> requester();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<CommunicationRequest_Payload>> payload();

  Optional<DateTime> authoredOn();

  Optional<Reference> subject();

  Optional<List<Reference>> reasonReference();

  Optional<List<CodeableConcept>> medium();

  Optional<CodeableConcept> statusReason();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> category();

  Optional<Meta> meta();

  Optional<Reference> sender();

  Optional<Reference> encounter();

  Optional<Code> priority();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Boolean> doNotPerform();

  Optional<Identifier> groupIdentifier();

  static ImmutableCommunicationRequest.ResourceTypeBuildStage builder() {
    return ImmutableCommunicationRequest.builder();
  }
}
