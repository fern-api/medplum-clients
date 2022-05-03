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
  Optional<CodeableConcept> code();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<Reference>> replaces();

  Optional<List<Identifier>> identifier();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> basedOn();

  Optional<Code> intent();

  Optional<Code> priority();

  Optional<Reference> author();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<Uri>> instantiatesUri();

  Optional<DateTime> authoredOn();

  Optional<List<RequestGroup_Action>> action();

  Optional<Code> language();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Reference> subject();

  Optional<Meta> meta();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> encounter();

  Optional<Code> status();

  static ImmutableRequestGroup.ResourceTypeBuildStage builder() {
    return ImmutableRequestGroup.builder();
  }
}
