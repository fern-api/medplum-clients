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
    as = ImmutableClaim_Payee.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Payee {
  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<String> id();

  Optional<Reference> party();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim_Payee.TypeBuildStage builder() {
    return ImmutableClaim_Payee.builder();
  }
}
