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
    as = ImmutableExplanationOfBenefit_SubDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_SubDetail {
  Optional<List<Extension>> modifierExtension();

  Optional<Money> net();

  Optional<CodeableConcept> revenue();

  Optional<List<positiveInt>> noteNumber();

  Optional<List<CodeableConcept>> modifier();

  CodeableConcept productOrService();

  Optional<Quantity> quantity();

  Optional<decimal> factor();

  Optional<CodeableConcept> category();

  Optional<positiveInt> sequence();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<Extension>> extension();

  Optional<Money> unitPrice();

  Optional<String> id();

  Optional<List<Reference>> udi();

  static ImmutableExplanationOfBenefit_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail.builder();
  }
}
