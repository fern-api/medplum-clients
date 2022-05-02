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
  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> modifier();

  Optional<Money> net();

  Optional<Decimal> factor();

  Optional<List<Extension>> modifierExtension();

  Optional<Money> unitPrice();

  Optional<String> id();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<Extension>> extension();

  CodeableConcept productOrService();

  static ImmutableExplanationOfBenefit_SubDetail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail1.builder();
  }
}
