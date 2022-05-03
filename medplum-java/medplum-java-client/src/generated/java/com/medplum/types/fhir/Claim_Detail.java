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

  Optional<List<Claim_SubDetail>> subDetail();

  Optional<Quantity> quantity();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> revenue();

  Optional<CodeableConcept> category();

  Optional<Money> net();

  Optional<Money> unitPrice();

  Optional<PositiveInt> sequence();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> modifier();

  Optional<String> id();

  Optional<Decimal> factor();

  Optional<List<CodeableConcept>> programCode();

  CodeableConcept productOrService();

  static ImmutableClaim_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Detail.builder();
  }
}
