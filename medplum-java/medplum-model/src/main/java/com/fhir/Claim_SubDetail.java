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
    as = ImmutableClaim_SubDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_SubDetail {
  Optional<List<CodeableConcept>> modifier();

  Optional<Money> net();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<Extension>> extension();

  Optional<decimal> factor();

  Optional<List<Extension>> modifierExtension();

  Optional<Money> unitPrice();

  Optional<positiveInt> sequence();

  Optional<CodeableConcept> revenue();

  Optional<String> id();

  CodeableConcept productOrService();

  Optional<CodeableConcept> category();

  Optional<Quantity> quantity();

  Optional<List<Reference>> udi();

  static ImmutableClaim_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_SubDetail.builder();
  }
}
