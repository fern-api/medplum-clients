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
    as = ImmutableDetectedIssue_Mitigation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DetectedIssue_Mitigation {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<String> id();

  CodeableConcept action();

  Optional<Reference> author();

  static ImmutableDetectedIssue_Mitigation.ActionBuildStage builder() {
    return ImmutableDetectedIssue_Mitigation.builder();
  }
}
