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
    as = ImmutableClaim_SubDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_SubDetail {
  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> revenue();

  Optional<CodeableConcept> category();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> udi();

  Optional<List<CodeableConcept>> modifier();

  Optional<List<CodeableConcept>> programCode();

  Optional<Money> unitPrice();

  Optional<Quantity> quantity();

  Optional<Decimal> factor();

  CodeableConcept productOrService();

  Optional<Money> net();

  static ImmutableClaim_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_SubDetail.builder();
  }
}