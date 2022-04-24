package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Reference>> reasonReference();

  Optional<Meta> meta();

  Optional<List<canonical>> instantiatesCanonical();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<dateTime> sent();

  Optional<List<ResourceList>> contained();

  Optional<code> priority();

  Optional<List<Reference>> recipient();

  Optional<dateTime> received();

  Optional<List<Extension>> modifierExtension();

  Optional<id> id();

  Optional<Narrative> text();

  Optional<List<uri>> instantiatesUri();

  Optional<List<Reference>> about();

  Optional<Reference> encounter();

  Optional<uri> implicitRules();

  Optional<List<Reference>> inResponseTo();

  Optional<code> status();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Extension>> extension();

  Optional<Reference> subject();

  Optional<List<Communication_Payload>> payload();

  Optional<code> language();

  Optional<List<Reference>> partOf();

  Optional<CodeableConcept> statusReason();

  Optional<CodeableConcept> topic();

  Optional<List<CodeableConcept>> medium();

  Optional<List<CodeableConcept>> category();

  Optional<List<Annotation>> note();

  Optional<Reference> sender();

  Optional<List<Reference>> basedOn();

  static ImmutableCommunication.ResourceTypeBuildStage builder() {
    return ImmutableCommunication.builder();
  }
}
