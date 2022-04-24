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
    as = ImmutableBasic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Basic {
  Optional<List<Extension>> extension();

  Optional<Reference> author();

  Optional<id> id();

  Optional<code> language();

  Optional<uri> implicitRules();

  CodeableConcept code();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Reference> subject();

  Optional<List<Extension>> modifierExtension();

  Optional<date> created();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Identifier>> identifier();

  static ImmutableBasic.CodeBuildStage builder() {
    return ImmutableBasic.builder();
  }
}
