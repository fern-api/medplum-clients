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
  Optional<Code> priority();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> reasonReference();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> replaces();

  Optional<Reference> encounter();

  Optional<Reference> sender();

  Optional<List<CommunicationRequest_Payload>> payload();

  Optional<CodeableConcept> statusReason();

  Optional<Code> status();

  Optional<List<Reference>> recipient();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<String> occurrenceDateTime();

  Optional<Reference> subject();

  Optional<Reference> requester();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<Reference>> basedOn();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> authoredOn();

  Optional<Boolean> doNotPerform();

  Optional<List<Reference>> about();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> medium();

  Optional<List<Annotation>> note();

  static ImmutableCommunicationRequest.ResourceTypeBuildStage builder() {
    return ImmutableCommunicationRequest.builder();
  }
}
