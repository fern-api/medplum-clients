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
    as = ImmutableRange.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Range {
  Optional<Quantity> low();

  Optional<String> id();

  Optional<Quantity> high();

  Optional<List<Extension>> extension();

  static ImmutableRange.Builder builder() {
    return ImmutableRange.builder();
  }
}
