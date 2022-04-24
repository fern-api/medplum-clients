package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<positiveInt> sequence();

  Optional<List<Extension>> extension();

  Optional<Boolean> responsible();

  Optional<CodeableConcept> qualification();

  Optional<String> id();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> modifierExtension();

  Reference provider();

  static ImmutableClaim_CareTeam.ProviderBuildStage builder() {
    return ImmutableClaim_CareTeam.builder();
  }
}
