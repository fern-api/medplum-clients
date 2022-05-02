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
  Optional<String> detail();

  Optional<String> identifiedDateTime();

  Optional<Reference> author();

  Optional<Meta> meta();

  Optional<CodeableConcept> code();

  String resourceType();

  Optional<Uri> reference();

  Optional<DetectedissueSeverity> severity();

  Optional<Narrative> text();

  Optional<Code> status();

  Optional<List<DetectedIssue_Mitigation>> mitigation();

  Optional<List<ResourceList>> contained();

  Optional<Period> identifiedPeriod();

  Optional<List<DetectedIssue_Evidence>> evidence();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> patient();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> implicated();

  static ImmutableDetectedIssue.ResourceTypeBuildStage builder() {
    return ImmutableDetectedIssue.builder();
  }
}
