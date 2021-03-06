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
    as = ImmutablePlanDefinition_DynamicValue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface PlanDefinition_DynamicValue {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Expression> expression();

  Optional<List<Extension>> extension();

  Optional<String> path();

  static ImmutablePlanDefinition_DynamicValue.Builder builder() {
    return ImmutablePlanDefinition_DynamicValue.builder();
  }
}
