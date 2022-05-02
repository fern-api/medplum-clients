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
  Optional<List<CodeableConcept>> modifier();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<PositiveInt>> noteNumber();

  Optional<Money> net();

  Optional<String> id();

  CodeableConcept productOrService();

  Optional<Decimal> factor();

  Optional<Quantity> quantity();

  Optional<List<ExplanationOfBenefit_SubDetail1>> subDetail();

  Optional<Money> unitPrice();

  Optional<List<ExplanationOfBenefit_Adjudication>> adjudication();

  static ImmutableExplanationOfBenefit_Detail1.ProductOrServiceBuildStage builder() {
    return ImmutableExplanationOfBenefit_Detail1.builder();
  }
}
