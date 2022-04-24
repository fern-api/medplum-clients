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
    as = ImmutableExplanationOfBenefit_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Detail {
  Optional<List<Extension>> extension();

  Optional<Money> net();

  CodeableConcept productOrService();

  Optional<List<CodeableConcept>> modifier();

  Optional<CodeableConcept> revenue();

  Optional<Money> unitPrice();

  Optional<List<positiveInt>> noteNumber();

  Optional<List<Reference>> udi();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<positiveInt> sequence();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> programCode();

  Optional<decimal> factor();

  Optional<Quantity> quantity();

  Optional<List<ExplanationOfBenefit_SubDetail>> subDetail();

  Optional<String> id();

  Optional<CodeableConcept> category();

  static ImmutableExplanationOfBenefit_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Detail.builder();
  }
}
