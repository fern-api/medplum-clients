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
    as = ImmutableClaimResponse_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Item {
  Optional<PositiveInt> itemSequence();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ClaimResponse_Detail>> detail();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<String> id();

  Optional<List<PositiveInt>> noteNumber();

  static ImmutableClaimResponse_Item.Builder builder() {
    return ImmutableClaimResponse_Item.builder();
  }
}
