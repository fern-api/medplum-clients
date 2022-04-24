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
    as = ImmutableOperationDefinition_ReferencedFrom.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition_ReferencedFrom {
  Optional<String> sourceId();

  Optional<List<Extension>> extension();

  Optional<String> source();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableOperationDefinition_ReferencedFrom.Builder builder() {
    return ImmutableOperationDefinition_ReferencedFrom.builder();
  }
}
