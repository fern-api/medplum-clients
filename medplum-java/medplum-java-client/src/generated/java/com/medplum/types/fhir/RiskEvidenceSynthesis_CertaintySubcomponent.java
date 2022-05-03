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
  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> rating();

  Optional<List<Annotation>> note();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  static ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.Builder builder() {
    return ImmutableRiskEvidenceSynthesis_CertaintySubcomponent.builder();
  }
}
