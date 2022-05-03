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
  CodeableConcept productOrService();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> category();

  Optional<Money> net();

  Optional<PositiveInt> sequence();

  Optional<String> id();

  Optional<CodeableConcept> revenue();

  Optional<Money> unitPrice();

  Optional<List<Reference>> udi();

  Optional<List<CodeableConcept>> modifier();

  Optional<Quantity> quantity();

  Optional<List<Extension>> extension();

  Optional<Decimal> factor();

  Optional<List<CodeableConcept>> programCode();

  static ImmutableClaim_SubDetail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_SubDetail.builder();
  }
}
