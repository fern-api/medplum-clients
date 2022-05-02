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

  Optional<CodeableConcept> category();

  Optional<CodeableConcept> start();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<RelatedArtifact>> documentation();

  CodeableConcept description();

  Optional<CodeableConcept> priority();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> addresses();

  static ImmutablePlanDefinition_Goal.DescriptionBuildStage builder() {
    return ImmutablePlanDefinition_Goal.builder();
  }
}
