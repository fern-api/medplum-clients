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
    as = ImmutableRequestGroup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RequestGroup {
  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> replaces();

  Optional<List<canonical>> instantiatesCanonical();

  Optional<List<RequestGroup_Action>> action();

  Optional<id> id();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<code> status();

  Optional<Reference> author();

  Optional<code> priority();

  Optional<CodeableConcept> code();

  Optional<List<Identifier>> identifier();

  Optional<dateTime> authoredOn();

  Optional<Reference> encounter();

  Optional<List<Annotation>> note();

  Optional<List<uri>> instantiatesUri();

  Optional<Reference> subject();

  Optional<List<Reference>> basedOn();

  Optional<code> intent();

  Optional<Identifier> groupIdentifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Meta> meta();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> reasonReference();

  static ImmutableRequestGroup.ResourceTypeBuildStage builder() {
    return ImmutableRequestGroup.builder();
  }
}
