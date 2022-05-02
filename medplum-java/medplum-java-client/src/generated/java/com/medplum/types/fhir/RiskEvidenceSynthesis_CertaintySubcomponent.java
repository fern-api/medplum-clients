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
    as = ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskEvidenceSynthesis_CertaintySubcomponent {
  Optional<String> id();

  Optional<List<Annotation>> note();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> rating();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.builder();
  }
}
