package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableGraphDefinition_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GraphDefinition_Link {
  Optional<String> path();

  Optional<List<Extension>> extension();

  Optional<Integer> min();

  Optional<String> max();

  Optional<String> sliceName();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<GraphDefinition_Target>> target();

  Optional<String> description();

  static ImmutableGraphDefinition_Link.Builder builder() {
    return ImmutableGraphDefinition_Link.builder();
  }
}
