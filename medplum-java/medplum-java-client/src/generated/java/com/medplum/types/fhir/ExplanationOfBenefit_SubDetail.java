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
  Optional<PositiveInt> sequence();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> net();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept productOrService();

  Optional<String> id();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> revenue();

  Optional<Decimal> factor();

  Optional<List<Reference>> udi();

  Optional<Money> unitPrice();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> extension();

  static ImmutableExplanationOfBenefit_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail.builder();
  }
}
