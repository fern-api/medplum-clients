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
    as = ImmutableElement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Element {
  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableElement.Builder builder() {
    return ImmutableElement.builder();
  }
}
