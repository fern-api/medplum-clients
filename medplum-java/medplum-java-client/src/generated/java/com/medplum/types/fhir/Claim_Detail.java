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
  Optional<List<CodeableConcept>> programCode();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> category();

  Optional<Decimal> factor();

  Optional<Money> unitPrice();

  Optional<Money> net();

  Optional<List<Reference>> udi();

  Optional<List<Claim_SubDetail>> subDetail();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept productOrService();

  Optional<CodeableConcept> revenue();

  Optional<Quantity> quantity();

  Optional<String> id();

  Optional<List<CodeableConcept>> modifier();

  static ImmutableClaim_Detail.ProductOrServiceBuildStage builder() {
    return ImmutableClaim_Detail.builder();
  }
}
