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
  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> morphology();

  Optional<CodeableConcept> location();

  Optional<Boolean> active();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> locationQualifier();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<String> description();

  Optional<List<Attachment>> image();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Reference patient();

  static ImmutableBodyStructure.ResourceTypeBuildStage builder() {
    return ImmutableBodyStructure.builder();
  }
}
