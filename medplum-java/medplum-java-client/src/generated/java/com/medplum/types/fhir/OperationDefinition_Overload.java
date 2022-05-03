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
    as = ImmutableOperationDefinition_Overload.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition_Overload {
  Optional<List<String>> parameterName();

  Optional<List<Extension>> modifierExtension();

  Optional<String> comment();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableOperationDefinition_Overload.Builder builder() {
    return ImmutableOperationDefinition_Overload.builder();
  }
}
