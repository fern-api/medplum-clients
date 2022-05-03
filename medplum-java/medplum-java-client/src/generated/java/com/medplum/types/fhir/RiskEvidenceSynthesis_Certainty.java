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
    as = ImmutableRiskEvidenceSynthesis_Certainty.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis_Certainty {
  Optional<List<Annotation>> note();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> rating();

  Optional<List<RiskEvidenceSynthesis_CertaintySubcomponent>> certaintySubcomponent();

  static ImmutableRiskEvidenceSynthesis_Certainty.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_Certainty.builder();
  }
}
