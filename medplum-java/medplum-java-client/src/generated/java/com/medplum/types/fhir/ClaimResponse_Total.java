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
  Optional<List<Extension>> modifierExtension();

  CodeableConcept category();

  Money amount();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableClaimResponse_Total.CategoryBuildStage builder() {
    return ImmutableClaimResponse_Total.builder();
  }
}
