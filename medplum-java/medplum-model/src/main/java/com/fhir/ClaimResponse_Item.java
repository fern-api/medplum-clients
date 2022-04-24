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
    as = ImmutableClaimResponse_Item.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Item {
  Optional<List<ClaimResponse_Detail>> detail();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<positiveInt> itemSequence();

  Optional<List<positiveInt>> noteNumber();

  List<ClaimResponse_Adjudication> adjudication();

  Optional<String> id();

  static ImmutableClaimResponse_Item.Builder builder() {
    return ImmutableClaimResponse_Item.builder();
  }
}
