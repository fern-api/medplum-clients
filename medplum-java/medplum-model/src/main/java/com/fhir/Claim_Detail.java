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
    as = ImmutableClaim_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Detail {
  CodeableConcept productOrService();

  Optional<List<CodeableConcept>> modifier();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> revenue();

  Optional<decimal> factor();

  Optional<Money> net();

  Optional<String> id();

  Optional<Money> unitPrice();

  Optional<List<Claim_SubDetail>> subDetail();

  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> quantity();

  Optional<List<Reference>> udi();

  Optional<List<CodeableConcept>> programCode();

  Optional<positiveInt> sequence();

  static ImmutableClaim_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Detail.builder();
  }
}
