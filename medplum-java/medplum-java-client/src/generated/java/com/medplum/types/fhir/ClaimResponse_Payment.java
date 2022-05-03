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
  Optional<CodeableConcept> adjustmentReason();

  CodeableConcept type();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Money> adjustment();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> date();

  Money amount();

  Optional<Identifier> identifier();

  static ImmutableClaimResponse_Payment.TypeBuildStage builder() {
    return ImmutableClaimResponse_Payment.builder();
  }
}
