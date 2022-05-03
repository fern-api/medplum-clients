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
  Optional<List<Extension>> extension();

  Optional<Money> amount();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<CodeableConcept> adjustmentReason();

  Optional<Date> date();

  Optional<String> id();

  Optional<CodeableConcept> type();

  Optional<Money> adjustment();

  static ImmutableExplanationOfBenefit_Payment.Builder builder() {
    return ImmutableExplanationOfBenefit_Payment.builder();
  }
}
