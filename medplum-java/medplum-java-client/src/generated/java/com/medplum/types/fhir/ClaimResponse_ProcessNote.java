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
    as = ImmutableClaimResponse_ProcessNote.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClaimResponse_ProcessNote {
  Optional<String> id();

  Optional<String> text();

  Optional<List<Extension>> extension();

  Optional<Claimresponse_processnoteType> type();

  Optional<PositiveInt> number();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> language();

  static ImmutableClaimResponse_ProcessNote.Builder builder() {
    return ImmutableClaimResponse_ProcessNote.builder();
  }
}
