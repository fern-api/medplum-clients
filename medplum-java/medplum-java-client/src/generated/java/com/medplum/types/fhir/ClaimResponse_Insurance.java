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
    as = ImmutableClaimResponse_Insurance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Insurance {
  Optional<PositiveInt> sequence();

  Optional<Boolean> focal();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> claimResponse();

  Optional<String> id();

  Reference coverage();

  Optional<String> businessArrangement();

  static ImmutableClaimResponse_Insurance.CoverageBuildStage builder() {
    return ImmutableClaimResponse_Insurance.builder();
  }
}
