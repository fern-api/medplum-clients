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
    as = ImmutableDetectedIssue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DetectedIssue {
  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Period> identifiedPeriod();

  Optional<uri> reference();

  Optional<Meta> meta();

  Optional<CodeableConcept> code();

  Optional<Reference> patient();

  Optional<List<DetectedIssue_Mitigation>> mitigation();

  Optional<code> status();

  Optional<String> identifiedDateTime();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> implicated();

  Optional<String> detail();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<id> id();

  Optional<code> language();

  Optional<List<DetectedIssue_Evidence>> evidence();

  String resourceType();

  Optional<DetectedissueSeverity> severity();

  Optional<Reference> author();

  static ImmutableDetectedIssue.ResourceTypeBuildStage builder() {
    return ImmutableDetectedIssue.builder();
  }
}
