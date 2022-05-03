package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> min();

  Optional<String> description();

  Optional<String> path();

  Optional<String> max();

  Optional<String> sliceName();

  Optional<List<GraphDefinition_Target>> target();

  static ImmutableGraphDefinition_Link.Builder builder() {
    return ImmutableGraphDefinition_Link.builder();
  }
}
