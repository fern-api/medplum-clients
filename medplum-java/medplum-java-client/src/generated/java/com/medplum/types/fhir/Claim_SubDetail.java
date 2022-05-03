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
  Optional<List<CodeableConcept>> programCode();

  Optional<Money> unitPrice();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> revenue();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> category();

  Optional<Money> net();

  Optional<String> id();

  Optional<List<Reference>> udi();

  CodeableConcept productOrService();

  Optional<Decimal> factor();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> sequence();

  Optional<List<CodeableConcept>> modifier();

  static ImmutableClaim_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_SubDetail.builder();
  }
}
