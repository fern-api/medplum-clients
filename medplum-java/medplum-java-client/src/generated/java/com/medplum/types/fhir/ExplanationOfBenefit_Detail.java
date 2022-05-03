package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  CodeableConcept productOrService();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<ExplanationOfBenefit_SubDetail>> subDetail();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> category();

  Optional<List<Reference>> udi();

  Optional<Decimal> factor();

  Optional<Money> net();

  Optional<Money> unitPrice();

  Optional<CodeableConcept> revenue();

  static ImmutableExplanationOfBenefit_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Detail.builder();
  }
}
