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
    as = ImmutablePlanDefinition_RelatedAction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_RelatedAction {
  Optional<Duration> offsetDuration();

  Optional<id> actionId();

  Optional<Plandefinition_relatedactionRelationship> relationship();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Range> offsetRange();

  Optional<List<Extension>> extension();

  static ImmutablePlanDefinition_RelatedAction.Builder builder() {
    return ImmutablePlanDefinition_RelatedAction.builder();
  }
}
