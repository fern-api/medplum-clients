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
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> relationship();

  Optional<Reference> claim();

  Optional<String> id();

  Optional<Identifier> reference();

  Optional<List<Extension>> extension();

  static ImmutableClaim_Related.Builder builder() {
    return ImmutableClaim_Related.builder();
  }
}
