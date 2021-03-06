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
    as = ImmutableResearchStudy_Objective.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchStudy_Objective {
  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> name();

  Optional<List<Extension>> extension();

  static ImmutableResearchStudy_Objective.Builder builder() {
    return ImmutableResearchStudy_Objective.builder();
  }
}
