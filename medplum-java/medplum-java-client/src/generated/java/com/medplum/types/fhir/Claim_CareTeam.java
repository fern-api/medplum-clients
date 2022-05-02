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
  Reference provider();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> responsible();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> qualification();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> role();

  static ImmutableClaim_CareTeam.ProviderBuildStage builder() {
    return ImmutableClaim_CareTeam.builder();
  }
}
