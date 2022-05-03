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
  Optional<DetectedissueSeverity> severity();

  Optional<Uri> reference();

  Optional<List<DetectedIssue_Mitigation>> mitigation();

  Optional<Reference> patient();

  Optional<Uri> implicitRules();

  Optional<Code> status();

  Optional<CodeableConcept> code();

  Optional<List<DetectedIssue_Evidence>> evidence();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Period> identifiedPeriod();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> implicated();

  Optional<String> detail();

  Optional<String> identifiedDateTime();

  static ImmutableDetectedIssue.ResourceTypeBuildStage builder() {
    return ImmutableDetectedIssue.builder();
  }
}
