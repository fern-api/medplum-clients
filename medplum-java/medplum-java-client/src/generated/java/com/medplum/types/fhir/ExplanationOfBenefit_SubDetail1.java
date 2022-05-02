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
    as = ImmutableExplanationOfBenefit_SubDetail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_SubDetail1 {
  Optional<Money> unitPrice();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Quantity> quantity();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> net();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  CodeableConcept productOrService();

  Optional<String> id();

  Optional<Decimal> factor();

  static ImmutableExplanationOfBenefit_SubDetail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail1.builder();
  }
}
