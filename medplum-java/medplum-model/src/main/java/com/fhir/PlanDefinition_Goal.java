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
    as = ImmutablePlanDefinition_Goal.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Goal {
  Optional<String> id();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> start();

  Optional<List<CodeableConcept>> addresses();

  Optional<CodeableConcept> category();

  CodeableConcept description();

  Optional<List<Extension>> extension();

  Optional<List<PlanDefinition_Target>> target();

  Optional<CodeableConcept> priority();

  static ImmutablePlanDefinition_Goal.DescriptionBuildStage builder() {
    return ImmutablePlanDefinition_Goal.builder();
  }
}
