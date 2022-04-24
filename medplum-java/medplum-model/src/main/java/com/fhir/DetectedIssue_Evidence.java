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
    as = ImmutableDetectedIssue_Evidence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DetectedIssue_Evidence {
  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> detail();

  static ImmutableDetectedIssue_Evidence.Builder builder() {
    return ImmutableDetectedIssue_Evidence.builder();
  }
}
