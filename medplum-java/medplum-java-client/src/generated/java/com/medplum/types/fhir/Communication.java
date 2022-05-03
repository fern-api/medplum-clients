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
  Optional<List<Canonical>> instantiatesCanonical();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Code> priority();

  Optional<DateTime> sent();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> category();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> received();

  Optional<Reference> encounter();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> language();

  Optional<CodeableConcept> topic();

  Optional<List<Reference>> inResponseTo();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> about();

  Optional<Id> id();

  Optional<CodeableConcept> statusReason();

  Optional<List<Communication_Payload>> payload();

  Optional<List<Reference>> partOf();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> medium();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> recipient();

  Optional<Reference> sender();

  Optional<List<Reference>> reasonReference();

  Optional<List<ResourceList>> contained();

  Optional<Code> status();

  Optional<Reference> subject();

  static ImmutableCommunication.ResourceTypeBuildStage builder() {
    return ImmutableCommunication.builder();
  }
}
