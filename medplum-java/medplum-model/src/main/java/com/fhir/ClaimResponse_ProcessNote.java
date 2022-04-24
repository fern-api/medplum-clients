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
    as = ImmutableClaimResponse_ProcessNote.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_ProcessNote {
  Optional<CodeableConcept> language();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Claimresponse_processnoteType> type();

  Optional<positiveInt> number();

  Optional<String> text();

  static ImmutableClaimResponse_ProcessNote.Builder builder() {
    return ImmutableClaimResponse_ProcessNote.builder();
  }
}
