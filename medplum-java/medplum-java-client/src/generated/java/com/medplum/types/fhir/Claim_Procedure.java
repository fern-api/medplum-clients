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
  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> type();

  Optional<Reference> procedureReference();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> procedureCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<DateTime> date();

  Optional<List<Reference>> udi();

  static ImmutableClaim_Procedure.Builder builder() {
    return ImmutableClaim_Procedure.builder();
  }
}
