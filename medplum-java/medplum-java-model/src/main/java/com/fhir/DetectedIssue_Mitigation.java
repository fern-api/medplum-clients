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
    as = ImmutableDetectedIssue_Mitigation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DetectedIssue_Mitigation {
  CodeableConcept action();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<dateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> author();

  static ImmutableDetectedIssue_Mitigation.ActionBuildStage builder() {
    return ImmutableDetectedIssue_Mitigation.builder();
  }
}
