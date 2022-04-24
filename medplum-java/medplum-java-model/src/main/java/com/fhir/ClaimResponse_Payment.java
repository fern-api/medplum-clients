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
    as = ImmutableClaimResponse_Payment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Payment {
  Money amount();

  Optional<Money> adjustment();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<date> date();

  Optional<Identifier> identifier();

  Optional<String> id();

  Optional<CodeableConcept> adjustmentReason();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaimResponse_Payment.AmountBuildStage builder() {
    return ImmutableClaimResponse_Payment.builder();
  }
}
