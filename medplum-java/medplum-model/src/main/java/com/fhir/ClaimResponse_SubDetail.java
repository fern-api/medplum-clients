package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableClaimResponse_SubDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_SubDetail {
  Optional<List<positiveInt>> noteNumber();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  Optional<positiveInt> subDetailSequence();

  static ImmutableClaimResponse_SubDetail.Builder builder() {
    return ImmutableClaimResponse_SubDetail.builder();
  }
}
