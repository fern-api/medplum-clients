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
  Optional<List<CodeableConcept>> modifier();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<Reference>> udi();

  Optional<CodeableConcept> revenue();

  CodeableConcept productOrService();

  Optional<Decimal> factor();

  Optional<Quantity> quantity();

  Optional<String> id();

  Optional<Money> net();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> category();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Money> unitPrice();

  static ImmutableExplanationOfBenefit_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail.builder();
  }
}
