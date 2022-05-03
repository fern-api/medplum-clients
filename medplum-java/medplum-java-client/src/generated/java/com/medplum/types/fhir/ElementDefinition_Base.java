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
    as = ImmutableElementDefinition_Base.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Base {
  Optional<String> id();

  Optional<String> path();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> min();

  Optional<String> max();

  static ImmutableElementDefinition_Base.Builder builder() {
    return ImmutableElementDefinition_Base.builder();
  }
}
