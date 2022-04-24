package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableExplanationOfBenefit_Payment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Payment {
  Optional<Identifier> identifier();

  Optional<CodeableConcept> adjustmentReason();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Money> adjustment();

  Optional<Money> amount();

  Optional<date> date();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_Payment.Builder builder() {
    return ImmutableExplanationOfBenefit_Payment.builder();
  }
}
