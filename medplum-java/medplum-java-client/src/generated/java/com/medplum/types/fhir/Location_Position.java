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
    as = ImmutableLocation_Position.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Location_Position {
  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> longitude();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Decimal> latitude();

  Optional<Decimal> altitude();

  static ImmutableLocation_Position.Builder builder() {
    return ImmutableLocation_Position.builder();
  }
}