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
    as = ImmutableExplanationOfBenefit_Total.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Total {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Money amount();

  Optional<String> id();

  CodeableConcept category();

  static ImmutableExplanationOfBenefit_Total.AmountBuildStage builder() {
    return ImmutableExplanationOfBenefit_Total.builder();
  }
}
