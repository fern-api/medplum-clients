package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableClaim_CareTeam.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Claim_CareTeam {
  Optional<CodeableConcept> role();

  Optional<String> id();

  Optional<PositiveInt> sequence();

  Optional<List<Extension>> modifierExtension();

  Reference provider();

  Optional<Boolean> responsible();

  Optional<CodeableConcept> qualification();

  Optional<List<Extension>> extension();

  static ImmutableClaim_CareTeam.ProviderBuildStage builder() {
    return ImmutableClaim_CareTeam.builder();
  }
}
