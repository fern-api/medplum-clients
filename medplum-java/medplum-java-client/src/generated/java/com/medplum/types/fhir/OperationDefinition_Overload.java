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
  Optional<String> comment();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> parameterName();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableOperationDefinition_Overload.Builder builder() {
    return ImmutableOperationDefinition_Overload.builder();
  }
}
