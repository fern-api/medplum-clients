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
  Optional<Decimal> factor();

  Optional<PositiveInt> sequence();

  CodeableConcept productOrService();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> programCode();

  Optional<List<Extension>> modifierExtension();

  Optional<Money> net();

  Optional<List<CodeableConcept>> modifier();

  Optional<Quantity> quantity();

  Optional<CodeableConcept> revenue();

  Optional<CodeableConcept> category();

  Optional<List<Reference>> udi();

  Optional<Money> unitPrice();

  Optional<String> id();

  static ImmutableClaim_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_SubDetail.builder();
  }
}
