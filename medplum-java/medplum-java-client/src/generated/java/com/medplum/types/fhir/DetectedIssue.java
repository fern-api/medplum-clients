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
  Optional<List<Identifier>> identifier();

  Optional<Uri> reference();

  Optional<Narrative> text();

  Optional<Code> status();

  Optional<CodeableConcept> code();

  Optional<String> detail();

  Optional<Reference> author();

  Optional<DetectedissueSeverity> severity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> implicated();

  Optional<String> identifiedDateTime();

  Optional<List<Extension>> extension();

  Optional<List<DetectedIssue_Mitigation>> mitigation();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Meta> meta();

  Optional<Period> identifiedPeriod();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Reference> patient();

  Optional<List<DetectedIssue_Evidence>> evidence();

  static ImmutableDetectedIssue.ResourceTypeBuildStage builder() {
    return ImmutableDetectedIssue.builder();
  }
}
