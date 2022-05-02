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
    as = ImmutableExplanationOfBenefit_SubDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_SubDetail {
  Optional<Money> unitPrice();

  Optional<Money> net();

  CodeableConcept productOrService();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<PositiveInt> sequence();

  Optional<List<Reference>> udi();

  Optional<List<CodeableConcept>> programCode();

  Optional<Quantity> quantity();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> factor();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> noteNumber();

  Optional<CodeableConcept> revenue();

  Optional<CodeableConcept> category();

  Optional<List<CodeableConcept>> modifier();

  static ImmutableExplanationOfBenefit_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail.builder();
  }
}
