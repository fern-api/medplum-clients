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
  Optional<List<PositiveInt>> noteNumber();

  CodeableConcept productOrService();

  Optional<PositiveInt> sequence();

  Optional<List<Extension>> extension();

  Optional<Money> net();

  Optional<CodeableConcept> revenue();

  Optional<List<CodeableConcept>> programCode();

  Optional<Money> unitPrice();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> factor();

  Optional<String> id();

  Optional<Quantity> quantity();

  Optional<List<Reference>> udi();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<CodeableConcept>> modifier();

  Optional<CodeableConcept> category();

  static ImmutableExplanationOfBenefit_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail.builder();
  }
}
