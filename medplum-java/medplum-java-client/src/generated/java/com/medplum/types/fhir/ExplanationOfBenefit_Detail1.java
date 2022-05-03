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
    as = ImmutableExplanationOfBenefit_Detail1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Detail1 {
  Optional<Money> unitPrice();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<ExplanationOfBenefit_SubDetail1>> subDetail();

  Optional<Decimal> factor();

  CodeableConcept productOrService();

  Optional<String> id();

  Optional<Money> net();

  Optional<List<PositiveInt>> noteNumber();

  Optional<List<Extension>> extension();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  static ImmutableExplanationOfBenefit_Detail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Detail1.builder();
  }
}
