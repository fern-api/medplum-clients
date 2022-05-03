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
    as = ImmutableClaimResponse_Total.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Total {
  CodeableConcept category();

  Optional<List<Extension>> modifierExtension();

  Money amount();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableClaimResponse_Total.CategoryBuildStage builder() {
    return ImmutableClaimResponse_Total.builder();
  }
}
