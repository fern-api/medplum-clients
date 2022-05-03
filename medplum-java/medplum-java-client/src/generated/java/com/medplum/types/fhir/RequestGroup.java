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
    as = ImmutableRequestGroup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup {
  Optional<Reference> encounter();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Code> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> basedOn();

  Optional<Reference> subject();

  Optional<DateTime> authoredOn();

  Optional<List<Reference>> reasonReference();

  Optional<List<RequestGroup_Action>> action();

  Optional<CodeableConcept> code();

  Optional<List<Reference>> replaces();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<Code> priority();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> intent();

  Optional<Code> language();

  Optional<Identifier> groupIdentifier();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> reasonCode();

  static ImmutableRequestGroup.ResourceTypeBuildStage builder() {
    return ImmutableRequestGroup.builder();
  }
}
