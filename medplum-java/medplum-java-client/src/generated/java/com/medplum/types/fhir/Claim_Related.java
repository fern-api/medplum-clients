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
    as = ImmutableClaim_Related.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Related {
  Optional<Identifier> reference();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> relationship();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> claim();

  static ImmutableClaim_Related.Builder builder() {
    return ImmutableClaim_Related.builder();
  }
}
