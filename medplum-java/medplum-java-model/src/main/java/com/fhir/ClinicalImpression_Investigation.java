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
    as = ImmutableClinicalImpression_Investigation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClinicalImpression_Investigation {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept code();

  Optional<List<Reference>> item();

  static ImmutableClinicalImpression_Investigation.CodeBuildStage builder() {
    return ImmutableClinicalImpression_Investigation.builder();
  }
}
