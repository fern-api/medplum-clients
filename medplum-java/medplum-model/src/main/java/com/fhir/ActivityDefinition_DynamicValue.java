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
    as = ImmutableActivityDefinition_DynamicValue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ActivityDefinition_DynamicValue {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> path();

  Optional<List<Extension>> extension();

  Expression expression();

  static ImmutableActivityDefinition_DynamicValue.ExpressionBuildStage builder() {
    return ImmutableActivityDefinition_DynamicValue.builder();
  }
}
