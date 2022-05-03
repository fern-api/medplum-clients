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
  Optional<CodeableConcept> term();

  Optional<List<ExplanationOfBenefit_Financial>> financial();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept category();

  Optional<String> id();

  Optional<Boolean> excluded();

  Optional<String> name();

  Optional<CodeableConcept> unit();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> network();

  Optional<String> description();

  static ImmutableExplanationOfBenefit_BenefitBalance.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_BenefitBalance.builder();
  }
}
