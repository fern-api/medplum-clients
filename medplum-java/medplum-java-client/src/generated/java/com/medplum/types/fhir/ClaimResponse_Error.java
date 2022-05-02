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
    as = ImmutableClaimResponse_Error.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_Error {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<PositiveInt> itemSequence();

  Optional<PositiveInt> detailSequence();

  CodeableConcept code();

  Optional<String> id();

  Optional<PositiveInt> subDetailSequence();

  static ImmutableClaimResponse_Error.CodeBuildStage builder() {
    return ImmutableClaimResponse_Error.builder();
  }
}