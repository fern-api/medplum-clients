package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<CodeableConcept> location();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<CodeableConcept>> locationQualifier();

  Optional<CodeableConcept> morphology();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> active();

  Optional<String> description();

  Reference patient();

  Optional<List<Attachment>> image();

  Optional<Meta> meta();

  static ImmutableBodyStructure.ResourceTypeBuildStage builder() {
    return ImmutableBodyStructure.builder();
  }
}
