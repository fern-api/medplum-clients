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
    as = ImmutableActivityDefinition_DynamicValue.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ActivityDefinition_DynamicValue {
  Optional<String> id();

  Expression expression();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> path();

  static ImmutableActivityDefinition_DynamicValue.ExpressionBuildStage builder() {
    return ImmutableActivityDefinition_DynamicValue.builder();
  }
}
