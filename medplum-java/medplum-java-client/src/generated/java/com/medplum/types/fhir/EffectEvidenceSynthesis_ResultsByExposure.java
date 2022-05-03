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
    as = ImmutableEffectEvidenceSynthesis_ResultsByExposure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EffectEvidenceSynthesis_ResultsByExposure {
  Optional<String> id();

  Optional<CodeableConcept> variantState();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState();

  Optional<String> description();

  Reference riskEvidenceSynthesis();

  static ImmutableEffectEvidenceSynthesis_ResultsByExposure.RiskEvidenceSynthesisBuildStage builder(
      ) {
    return ImmutableEffectEvidenceSynthesis_ResultsByExposure.builder();
  }
}
