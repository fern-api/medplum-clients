package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableClaim_Insurance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Insurance {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Identifier> identifier();

  Optional<Boolean> focal();

  Reference coverage();

  Optional<PositiveInt> sequence();

  Optional<List<String>> preAuthRef();

  Optional<Reference> claimResponse();

  Optional<List<Extension>> extension();

  Optional<String> businessArrangement();

  static ImmutableClaim_Insurance.CoverageBuildStage builder() {
    return ImmutableClaim_Insurance.builder();
  }
}
