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
    as = ImmutablePlanDefinition_RelatedAction.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_RelatedAction {
  Optional<Range> offsetRange();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Plandefinition_relatedactionRelationship> relationship();

  Optional<Id> actionId();

  Optional<Duration> offsetDuration();

  static ImmutablePlanDefinition_RelatedAction.Builder builder() {
    return ImmutablePlanDefinition_RelatedAction.builder();
  }
}
