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
    as = ImmutableExplanationOfBenefit_Detail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Detail1 {
  Optional<decimal> factor();

  Optional<Money> unitPrice();

  Optional<List<ExplanationOfBenefit_SubDetail1>> subDetail();

  Optional<List<positiveInt>> noteNumber();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept productOrService();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Money> net();

  Optional<Quantity> quantity();

  static ImmutableExplanationOfBenefit_Detail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Detail1.builder();
  }
}
