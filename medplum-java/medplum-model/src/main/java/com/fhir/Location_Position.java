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
    as = ImmutableLocation_Position.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Location_Position {
  Optional<decimal> altitude();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<decimal> longitude();

  Optional<decimal> latitude();

  Optional<String> id();

  static ImmutableLocation_Position.Builder builder() {
    return ImmutableLocation_Position.builder();
  }
}
