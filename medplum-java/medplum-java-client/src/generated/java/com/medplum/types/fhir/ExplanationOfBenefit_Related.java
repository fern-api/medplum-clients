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
    as = ImmutableExplanationOfBenefit_Related.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Related {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Identifier> reference();

  Optional<CodeableConcept> relationship();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> claim();

  static ImmutableExplanationOfBenefit_Related.Builder builder() {
    return ImmutableExplanationOfBenefit_Related.builder();
  }
}
