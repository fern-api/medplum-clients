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
  Optional<CodeableConcept> category();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept description();

  Optional<CodeableConcept> priority();

  Optional<List<PlanDefinition_Target>> target();

  Optional<CodeableConcept> start();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> addresses();

  Optional<List<RelatedArtifact>> documentation();

  static ImmutablePlanDefinition_Goal.DescriptionBuildStage builder() {
    return ImmutablePlanDefinition_Goal.builder();
  }
}
