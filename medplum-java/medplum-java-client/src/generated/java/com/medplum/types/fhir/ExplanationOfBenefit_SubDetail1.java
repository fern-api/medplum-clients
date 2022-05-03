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
  Optional<List<Extension>> modifierExtension();

  Optional<Money> unitPrice();

  Optional<Decimal> factor();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Money> net();

  Optional<String> id();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  Optional<List<CodeableConcept>> modifier();

  CodeableConcept productOrService();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  static ImmutableExplanationOfBenefit_SubDetail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_SubDetail1.builder();
  }
}
