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
  Optional<String> id();

  CodeableConcept type();

  Optional<Money> adjustment();

  Optional<Identifier> identifier();

  Money amount();

  Optional<List<Extension>> extension();

  Optional<Date> date();

  Optional<CodeableConcept> adjustmentReason();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaimResponse_Payment.TypeBuildStage builder() {
    return ImmutableClaimResponse_Payment.builder();
  }
}
