package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Reference>> reasonReference();

  Optional<List<Identifier>> identifier();

  Optional<code> priority();

  Optional<List<Reference>> replaces();

  Optional<code> status();

  Optional<Reference> subject();

  Optional<List<Extension>> extension();

  Optional<Identifier> groupIdentifier();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> recipient();

  String resourceType();

  Optional<List<CodeableConcept>> medium();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> statusReason();

  Optional<Boolean> doNotPerform();

  Optional<dateTime> authoredOn();

  Optional<code> language();

  Optional<Reference> sender();

  Optional<Period> occurrencePeriod();

  Optional<Narrative> text();

  Optional<Reference> requester();

  Optional<uri> implicitRules();

  Optional<Reference> encounter();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> basedOn();

  Optional<id> id();

  Optional<List<CommunicationRequest_Payload>> payload();

  Optional<List<Reference>> about();

  Optional<String> occurrenceDateTime();

  static ImmutableCommunicationRequest.ResourceTypeBuildStage builder() {
    return ImmutableCommunicationRequest.builder();
  }
}
