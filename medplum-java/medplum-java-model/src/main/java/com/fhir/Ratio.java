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
    as = ImmutableRatio.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Ratio {
  Optional<Quantity> denominator();

  Optional<Quantity> numerator();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableRatio.Builder builder() {
    return ImmutableRatio.builder();
  }
}
