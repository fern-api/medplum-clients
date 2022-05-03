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
    as = ImmutableClaim_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Detail {
  Optional<List<Reference>> udi();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> extension();

  CodeableConcept productOrService();

  Optional<List<CodeableConcept>> modifier();

  Optional<Decimal> factor();

  Optional<CodeableConcept> revenue();

  Optional<String> id();

  Optional<List<Claim_SubDetail>> subDetail();

  Optional<Money> unitPrice();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<Extension>> modifierExtension();

  Optional<PositiveInt> sequence();

  Optional<Quantity> quantity();

  Optional<Money> net();

  static ImmutableClaim_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Detail.builder();
  }
}
