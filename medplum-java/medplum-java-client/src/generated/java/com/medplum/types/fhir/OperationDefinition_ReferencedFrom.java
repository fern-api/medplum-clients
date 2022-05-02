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
    as = ImmutableOperationDefinition_ReferencedFrom.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition_ReferencedFrom {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> source();

  Optional<String> sourceId();

  static ImmutableOperationDefinition_ReferencedFrom.Builder builder() {
    return ImmutableOperationDefinition_ReferencedFrom.builder();
  }
}
