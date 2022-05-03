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
  Optional<DateTime> received();

  String resourceType();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> basedOn();

  Optional<List<Reference>> inResponseTo();

  Optional<Id> id();

  Optional<List<CodeableConcept>> medium();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Narrative> text();

  Optional<Code> priority();

  Optional<Reference> encounter();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> about();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> subject();

  Optional<List<Reference>> reasonReference();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> recipient();

  Optional<Reference> sender();

  Optional<CodeableConcept> topic();

  Optional<List<Reference>> partOf();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<DateTime> sent();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> status();

  Optional<List<Communication_Payload>> payload();

  Optional<List<ResourceList>> contained();

  static ImmutableCommunication.ResourceTypeBuildStage builder() {
    return ImmutableCommunication.builder();
  }
}
