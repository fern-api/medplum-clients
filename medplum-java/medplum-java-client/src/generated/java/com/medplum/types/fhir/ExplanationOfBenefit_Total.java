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
    as = ImmutableExplanationOfBenefit_Total.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Total {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Money amount();

  CodeableConcept category();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_Total.AmountBuildStage builder() {
    return ImmutableExplanationOfBenefit_Total.builder();
  }
}
