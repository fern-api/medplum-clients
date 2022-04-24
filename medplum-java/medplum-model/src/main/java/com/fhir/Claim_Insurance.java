package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<List<String>> preAuthRef();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Reference coverage();

  Optional<Reference> claimResponse();

  Optional<positiveInt> sequence();

  Optional<String> businessArrangement();

  Optional<Boolean> focal();

  Optional<Identifier> identifier();

  static ImmutableClaim_Insurance.CoverageBuildStage builder() {
    return ImmutableClaim_Insurance.builder();
  }
}
