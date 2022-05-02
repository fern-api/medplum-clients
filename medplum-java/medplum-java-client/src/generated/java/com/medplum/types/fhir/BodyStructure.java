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

  Optional<String> description();

  Optional<List<Attachment>> image();

  String resourceType();

  Optional<CodeableConcept> morphology();

  Reference patient();

  Optional<List<Extension>> extension();

  Optional<Boolean> active();

  Optional<List<CodeableConcept>> locationQualifier();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Id> id();

  static ImmutableBodyStructure.ResourceTypeBuildStage builder() {
    return ImmutableBodyStructure.builder();
  }
}
