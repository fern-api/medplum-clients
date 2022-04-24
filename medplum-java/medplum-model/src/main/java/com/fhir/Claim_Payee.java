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
    as = ImmutableClaim_Payee.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Payee {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  Optional<Reference> party();

  static ImmutableClaim_Payee.TypeBuildStage builder() {
    return ImmutableClaim_Payee.builder();
  }
}
