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
  Optional<String> name();

  Optional<CodeableConcept> unit();

  Optional<Boolean> excluded();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> term();

  Optional<String> description();

  Optional<CodeableConcept> network();

  CodeableConcept category();

  Optional<List<ExplanationOfBenefit_Financial>> financial();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableExplanationOfBenefit_BenefitBalance.CategoryBuildStage builder() {
    return ImmutableExplanationOfBenefit_BenefitBalance.builder();
  }
}
