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
    as = ImmutableResearchStudy_Arm.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchStudy_Arm {
  Optional<String> name();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> description();

  static ImmutableResearchStudy_Arm.Builder builder() {
    return ImmutableResearchStudy_Arm.builder();
  }
}
