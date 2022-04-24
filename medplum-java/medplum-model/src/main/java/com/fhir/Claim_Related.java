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

  Optional<Reference> claim();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim_Related.Builder builder() {
    return ImmutableClaim_Related.builder();
  }
}
