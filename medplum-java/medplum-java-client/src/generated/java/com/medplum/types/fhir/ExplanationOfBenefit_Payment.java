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
    as = ImmutableExplanationOfBenefit_Payment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_Payment {
  Optional<CodeableConcept> adjustmentReason();

  Optional<String> id();

  Optional<Identifier> identifier();

  Optional<Money> adjustment();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> date();

  Optional<Money> amount();

  static ImmutableExplanationOfBenefit_Payment.Builder builder() {
    return ImmutableExplanationOfBenefit_Payment.builder();
  }
}
