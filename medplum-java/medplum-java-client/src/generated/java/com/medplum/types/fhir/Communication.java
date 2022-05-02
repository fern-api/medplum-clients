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
  Optional<List<CodeableConcept>> category();

  Optional<Narrative> text();

  Optional<List<Reference>> inResponseTo();

  Optional<Code> language();

  String resourceType();

  Optional<CodeableConcept> statusReason();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> reasonReference();

  Optional<DateTime> received();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> medium();

  Optional<List<Reference>> partOf();

  Optional<List<Reference>> about();

  Optional<List<Communication_Payload>> payload();

  Optional<Code> priority();

  Optional<List<Uri>> instantiatesUri();

  Optional<Reference> encounter();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> sent();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Reference> sender();

  Optional<List<Reference>> basedOn();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> recipient();

  Optional<CodeableConcept> topic();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Code> status();

  Optional<Reference> subject();

  static ImmutableCommunication.ResourceTypeBuildStage builder() {
    return ImmutableCommunication.builder();
  }
}
