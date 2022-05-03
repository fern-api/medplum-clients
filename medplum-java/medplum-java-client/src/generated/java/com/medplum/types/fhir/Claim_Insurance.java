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
  Optional<Boolean> focal();

  Optional<String> businessArrangement();

  Optional<List<Extension>> extension();

  Optional<PositiveInt> sequence();

  Optional<Identifier> identifier();

  Optional<List<String>> preAuthRef();

  Reference coverage();

  Optional<Reference> claimResponse();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim_Insurance.CoverageBuildStage builder() {
    return ImmutableClaim_Insurance.builder();
  }
}
