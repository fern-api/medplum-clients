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
    as = ImmutableDetectedIssue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DetectedIssue {
  Optional<List<DetectedIssue_Mitigation>> mitigation();

  Optional<Reference> patient();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<DetectedIssue_Evidence>> evidence();

  Optional<String> detail();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<Period> identifiedPeriod();

  Optional<String> identifiedDateTime();

  Optional<List<Reference>> implicated();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Uri> reference();

  Optional<DetectedissueSeverity> severity();

  Optional<Code> status();

  static ImmutableDetectedIssue.ResourceTypeBuildStage builder() {
    return ImmutableDetectedIssue.builder();
  }
}
