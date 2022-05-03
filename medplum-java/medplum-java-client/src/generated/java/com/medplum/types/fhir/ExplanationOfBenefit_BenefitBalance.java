package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<CodeableConcept> network();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> term();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ExplanationOfBenefit_Financial>> financial();

  Optional<String> name();

  CodeableConcept category();

  Optional<String> description();

  Optional<Boolean> excluded();

  Optional<CodeableConcept> unit();

  static ImmutableExplanationOfBenefit_BenefitBalance.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_BenefitBalance.builder();
  }
}
