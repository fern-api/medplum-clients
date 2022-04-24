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
    as = ImmutableEffectEvidenceSynthesis_ResultsByExposure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_ResultsByExposure {
  Optional<Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState();

  Optional<String> description();

  Optional<CodeableConcept> variantState();

  Reference riskEvidenceSynthesis();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableEffectEvidenceSynthesis_ResultsByExposure.RiskEvidenceSynthesisBuildStage builder(
      ) {
    return ImmutableEffectEvidenceSynthesis_ResultsByExposure.builder();
  }
}
