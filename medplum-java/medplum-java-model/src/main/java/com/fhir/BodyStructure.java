package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBodyStructure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface BodyStructure {
  Optional<List<Attachment>> image();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<Narrative> text();

  String resourceType();

  Reference patient();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> active();

  Optional<CodeableConcept> morphology();

  Optional<List<CodeableConcept>> locationQualifier();

  Optional<code> language();

  Optional<List<Extension>> extension();

  Optional<id> id();

  Optional<CodeableConcept> location();

  Optional<uri> implicitRules();

  static ImmutableBodyStructure.ResourceTypeBuildStage builder() {
    return ImmutableBodyStructure.builder();
  }
}
