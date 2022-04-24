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
    as = ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis_CertaintySubcomponent {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Annotation>> note();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> rating();

  static ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.builder();
  }
}
