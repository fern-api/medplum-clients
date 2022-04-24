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
    as = ImmutableClaim_Procedure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Procedure {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> procedureCodeableConcept();

  Optional<dateTime> date();

  Optional<String> id();

  Optional<Reference> procedureReference();

  Optional<positiveInt> sequence();

  Optional<List<CodeableConcept>> type();

  Optional<List<Reference>> udi();

  static ImmutableClaim_Procedure.Builder builder() {
    return ImmutableClaim_Procedure.builder();
  }
}
