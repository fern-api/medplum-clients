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
    as = ImmutablePlanDefinition_Condition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_Condition {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Plandefinition_conditionKind> kind();

  Optional<String> id();

  Optional<Expression> expression();

  static ImmutablePlanDefinition_Condition.Builder builder() {
    return ImmutablePlanDefinition_Condition.builder();
  }
}
