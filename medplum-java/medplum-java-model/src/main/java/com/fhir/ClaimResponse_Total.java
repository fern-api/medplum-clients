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
    as = ImmutableClaimResponse_Total.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Total {
  Optional<String> id();

  CodeableConcept category();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Money amount();

  static ImmutableClaimResponse_Total.CategoryBuildStage builder() {
    return ImmutableClaimResponse_Total.builder();
  }
}
