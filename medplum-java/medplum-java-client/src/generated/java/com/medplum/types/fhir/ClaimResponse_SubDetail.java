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
    as = ImmutableClaimResponse_SubDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_SubDetail {
  Optional<List<Extension>> modifierExtension();

  Optional<List<PositiveInt>> noteNumber();

  Optional<PositiveInt> subDetailSequence();

  Optional<List<ClaimResponse_Adjudication>> adjudication();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableClaimResponse_SubDetail.Builder builder() {
    return ImmutableClaimResponse_SubDetail.builder();
  }
}
