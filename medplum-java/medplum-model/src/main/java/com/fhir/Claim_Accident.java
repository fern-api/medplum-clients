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
    as = ImmutableClaim_Accident.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Accident {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<Reference> locationReference();

  Optional<date> date();

  Optional<String> id();

  Optional<Address> locationAddress();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim_Accident.Builder builder() {
    return ImmutableClaim_Accident.builder();
  }
}
