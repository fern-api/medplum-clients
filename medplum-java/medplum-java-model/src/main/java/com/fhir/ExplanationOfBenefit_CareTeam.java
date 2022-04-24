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
    as = ImmutableExplanationOfBenefit_CareTeam.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ExplanationOfBenefit_CareTeam {
  Optional<String> id();

  Optional<positiveInt> sequence();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> qualification();

  Optional<Boolean> responsible();

  Reference provider();

  static ImmutableExplanationOfBenefit_CareTeam.ProviderBuildStage builder() {
    return ImmutableExplanationOfBenefit_CareTeam.builder();
  }
}
