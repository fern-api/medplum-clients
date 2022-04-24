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
    as = ImmutableExplanationOfBenefit_SubDetail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_SubDetail1 {
  Optional<List<positiveInt>> noteNumber();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> unitPrice();

  Optional<decimal> factor();

  Optional<String> id();

  CodeableConcept productOrService();

  Optional<List<Extension>> extension();

  Optional<Money> net();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  static ImmutableExplanationOfBenefit_SubDetail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail1.builder();
  }
}
