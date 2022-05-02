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
  Optional<Code> intent();

  Optional<List<RequestGroup_Action>> action();

  Optional<Code> language();

  Optional<List<Reference>> basedOn();

  String resourceType();

  Optional<Reference> author();

  Optional<List<ResourceList>> contained();

  Optional<Code> status();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Id> id();

  Optional<Code> priority();

  Optional<DateTime> authoredOn();

  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Identifier> groupIdentifier();

  Optional<CodeableConcept> code();

  Optional<List<Reference>> replaces();

  Optional<Reference> subject();

  Optional<List<Uri>> instantiatesUri();

  Optional<List<Reference>> reasonReference();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableRequestGroup.ResourceTypeBuildStage builder() {
    return ImmutableRequestGroup.builder();
  }
}
