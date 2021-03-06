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
    as = ImmutableClinicalImpression_Investigation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClinicalImpression_Investigation {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<List<Reference>> item();

  Optional<String> id();

  static ImmutableClinicalImpression_Investigation.CodeBuildStage builder() {
    return ImmutableClinicalImpression_Investigation.builder();
  }
}
