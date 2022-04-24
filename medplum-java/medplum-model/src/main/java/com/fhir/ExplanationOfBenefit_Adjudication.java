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
    as = ImmutableExplanationOfBenefit_Adjudication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Adjudication {
  Optional<decimal> value();

  CodeableConcept category();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Money> amount();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> reason();

  static ImmutableExplanationOfBenefit_Adjudication.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_Adjudication.builder();
  }
}
