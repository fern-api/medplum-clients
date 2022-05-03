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
    as = ImmutableClaim_Accident.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Accident {
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> locationReference();

  Optional<List<Extension>> extension();

  Optional<Address> locationAddress();

  Optional<Date> date();

  Optional<String> id();

  Optional<CodeableConcept> type();

  static ImmutableClaim_Accident.Builder builder() {
    return ImmutableClaim_Accident.builder();
  }
}
