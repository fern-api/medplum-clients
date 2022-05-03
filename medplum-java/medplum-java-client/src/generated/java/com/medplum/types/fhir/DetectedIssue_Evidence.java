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
    as = ImmutableDetectedIssue_Evidence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DetectedIssue_Evidence {
  Optional<String> id();

  Optional<List<Reference>> detail();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> code();

  static ImmutableDetectedIssue_Evidence.Builder builder() {
    return ImmutableDetectedIssue_Evidence.builder();
  }
}
