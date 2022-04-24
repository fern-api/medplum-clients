package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExplanationOfBenefit_BenefitBalance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_BenefitBalance {
  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<CodeableConcept> term();

  Optional<CodeableConcept> network();

  CodeableConcept category();

  Optional<List<ExplanationOfBenefit_Financial>> financial();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> excluded();

  Optional<String> name();

  Optional<String> id();

  Optional<CodeableConcept> unit();

  static ImmutableExplanationOfBenefit_BenefitBalance.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_BenefitBalance.builder();
  }
}
