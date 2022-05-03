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
  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> active();

  Optional<List<CodeableConcept>> locationQualifier();

  Optional<String> description();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Reference patient();

  Optional<List<Attachment>> image();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<CodeableConcept> location();

  Optional<CodeableConcept> morphology();

  String resourceType();

  static ImmutableBodyStructure.PatientBuildStage builder() {
    return ImmutableBodyStructure.builder();
  }
}
