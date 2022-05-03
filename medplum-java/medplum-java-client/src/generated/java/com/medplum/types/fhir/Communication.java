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
    as = ImmutableCommunication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Communication {
  String resourceType();

  Optional<List<Reference>> reasonReference();

  Optional<DateTime> received();

  Optional<Reference> sender();

  Optional<DateTime> sent();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> about();

  Optional<Meta> meta();

  Optional<CodeableConcept> statusReason();

  Optional<Reference> encounter();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> inResponseTo();

  Optional<Code> priority();

  Optional<Reference> subject();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<CodeableConcept> topic();

  Optional<Code> status();

  Optional<List<CodeableConcept>> medium();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Reference>> recipient();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Communication_Payload>> payload();

  Optional<List<CodeableConcept>> category();

  Optional<List<Annotation>> note();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> basedOn();

  static ImmutableCommunication.ResourceTypeBuildStage builder() {
    return ImmutableCommunication.builder();
  }
}
