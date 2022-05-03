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
    as = ImmutableClaim_Procedure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_Procedure {
  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> procedureCodeableConcept();

  Optional<String> id();

  Optional<List<CodeableConcept>> type();

  Optional<DateTime> date();

  Optional<Reference> procedureReference();

  Optional<List<Reference>> udi();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableClaim_Procedure.Builder builder() {
    return ImmutableClaim_Procedure.builder();
  }
}
