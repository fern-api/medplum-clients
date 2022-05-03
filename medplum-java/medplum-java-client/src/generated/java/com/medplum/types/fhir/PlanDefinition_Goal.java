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
  Optional<List<PlanDefinition_Target>> target();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> start();

  Optional<String> id();

  CodeableConcept description();

  Optional<CodeableConcept> category();

  Optional<List<RelatedArtifact>> documentation();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> priority();

  Optional<List<CodeableConcept>> addresses();

  static ImmutablePlanDefinition_Goal.DescriptionBuildStage builder() {
    return ImmutablePlanDefinition_Goal.builder();
  }
}
