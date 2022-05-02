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
  Optional<Reference> subject();

  Optional<List<Reference>> basedOn();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> requester();

  Optional<Code> language();

  Optional<Code> priority();

  String resourceType();

  Optional<List<Reference>> recipient();

  Optional<Reference> encounter();

  Optional<Reference> sender();

  Optional<Identifier> groupIdentifier();

  Optional<DateTime> authoredOn();

  Optional<List<Annotation>> note();

  Optional<Code> status();

  Optional<List<Reference>> about();

  Optional<Boolean> doNotPerform();

  Optional<Id> id();

  Optional<List<CommunicationRequest_Payload>> payload();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> reasonReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> medium();

  Optional<String> occurrenceDateTime();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<Reference>> replaces();

  static ImmutableCommunicationRequest.ResourceTypeBuildStage builder() {
    return ImmutableCommunicationRequest.builder();
  }
}
