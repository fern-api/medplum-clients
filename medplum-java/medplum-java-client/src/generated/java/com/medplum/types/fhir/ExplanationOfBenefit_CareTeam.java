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
  Reference provider();

  Optional<CodeableConcept> qualification();

  Optional<List<Extension>> extension();

  Optional<Boolean> responsible();

  Optional<PositiveInt> sequence();

  Optional<CodeableConcept> role();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableExplanationOfBenefit_CareTeam.ProviderBuildStage builder() {
    return ImmutableExplanationOfBenefit_CareTeam.builder();
  }
}
