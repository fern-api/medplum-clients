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
    as = ImmutableClaimResponse_Payment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Payment {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Identifier> identifier();

  Optional<CodeableConcept> adjustmentReason();

  Money amount();

  CodeableConcept type();

  Optional<Date> date();

  Optional<Money> adjustment();

  Optional<String> id();

  static ImmutableClaimResponse_Payment.AmountBuildStage builder() {
    return ImmutableClaimResponse_Payment.builder();
  }
}
