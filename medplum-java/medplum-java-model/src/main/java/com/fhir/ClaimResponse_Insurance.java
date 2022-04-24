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
    as = ImmutableClaimResponse_Insurance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Insurance {
  Optional<Reference> claimResponse();

  Optional<Boolean> focal();

  Optional<positiveInt> sequence();

  Optional<List<Extension>> extension();

  Reference coverage();

  Optional<String> businessArrangement();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableClaimResponse_Insurance.CoverageBuildStage builder() {
    return ImmutableClaimResponse_Insurance.builder();
  }
}
