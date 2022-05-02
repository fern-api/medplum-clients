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
    as = ImmutableExplanationOfBenefit_CareTeam.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_CareTeam {
  Optional<String> id();

  Optional<PositiveInt> sequence();

  Optional<Boolean> responsible();

  Optional<CodeableConcept> qualification();

  Reference provider();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> extension();

  static ImmutableExplanationOfBenefit_CareTeam.ProviderBuildStage builder() {
    return ImmutableExplanationOfBenefit_CareTeam.builder();
  }
}
