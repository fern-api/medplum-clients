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
  Optional<Identifier> groupIdentifier();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> replaces();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> language();

  Optional<Reference> subject();

  Optional<List<Reference>> basedOn();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> status();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> reasonReference();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Meta> meta();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Code> intent();

  Optional<Reference> encounter();

  Optional<Reference> author();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> authoredOn();

  Optional<List<RequestGroup_Action>> action();

  Optional<Code> priority();

  Optional<CodeableConcept> code();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  static ImmutableRequestGroup.ResourceTypeBuildStage builder() {
    return ImmutableRequestGroup.builder();
  }
}
