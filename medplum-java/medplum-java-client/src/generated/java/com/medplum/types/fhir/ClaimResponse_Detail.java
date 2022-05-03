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
    as = ImmutableClaimResponse_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Detail {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<PositiveInt>> noteNumber();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<List<ClaimResponse_SubDetail>> subDetail();

  Optional<PositiveInt> detailSequence();

  static ImmutableClaimResponse_Detail.Builder builder() {
    return ImmutableClaimResponse_Detail.builder();
  }
}
