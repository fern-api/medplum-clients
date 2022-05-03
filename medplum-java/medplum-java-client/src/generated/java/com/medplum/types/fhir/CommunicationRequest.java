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
  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Id> id();

  Optional<Reference> sender();

  Optional<String> occurrenceDateTime();

  Optional<Reference> subject();

  Optional<Narrative> text();

  Optional<Boolean> doNotPerform();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> encounter();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> recipient();

  String resourceType();

  Optional<List<Reference>> replaces();

  Optional<Code> status();

  Optional<List<CommunicationRequest_Payload>> payload();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> basedOn();

  Optional<DateTime> authoredOn();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<Code> priority();

  Optional<List<ResourceList>> contained();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> medium();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> about();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> requester();

  static ImmutableCommunicationRequest.ResourceTypeBuildStage builder() {
    return ImmutableCommunicationRequest.builder();
  }
}
