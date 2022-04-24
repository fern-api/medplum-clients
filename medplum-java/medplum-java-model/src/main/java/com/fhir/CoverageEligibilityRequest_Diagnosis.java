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
    as = ImmutableCoverageEligibilityRequest_Diagnosis.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CoverageEligibilityRequest_Diagnosis {
  Optional<Reference> diagnosisReference();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> diagnosisCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCoverageEligibilityRequest_Diagnosis.Builder builder() {
    return ImmutableCoverageEligibilityRequest_Diagnosis.builder();
  }
}
