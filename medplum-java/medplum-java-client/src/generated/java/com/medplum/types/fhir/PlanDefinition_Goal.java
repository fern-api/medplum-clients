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
    as = ImmutablePlanDefinition_Goal.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Goal {
  Optional<String> id();

  Optional<CodeableConcept> category();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> start();

  Optional<List<CodeableConcept>> addresses();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> priority();

  Optional<List<PlanDefinition_Target>> target();

  CodeableConcept description();

  static ImmutablePlanDefinition_Goal.DescriptionBuildStage builder() {
    return ImmutablePlanDefinition_Goal.builder();
  }
}
