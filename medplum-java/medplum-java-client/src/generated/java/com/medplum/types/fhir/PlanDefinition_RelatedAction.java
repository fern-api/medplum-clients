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

  Optional<Plandefinition_relatedactionRelationship> relationship();

  Optional<Duration> offsetDuration();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> actionId();

  static ImmutablePlanDefinition_RelatedAction.Builder builder() {
    return ImmutablePlanDefinition_RelatedAction.builder();
  }
}
