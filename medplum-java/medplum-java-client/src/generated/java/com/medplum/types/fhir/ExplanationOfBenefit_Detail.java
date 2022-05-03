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
  Optional<List<CodeableConcept>> modifier();

  Optional<PositiveInt> sequence();

  Optional<Money> unitPrice();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Quantity> quantity();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<ExplanationOfBenefit_SubDetail>> subDetail();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> revenue();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> programCode();

  Optional<Decimal> factor();

  Optional<Money> net();

  Optional<List<Reference>> udi();

  CodeableConcept productOrService();

  static ImmutableExplanationOfBenefit_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Detail.builder();
  }
}
