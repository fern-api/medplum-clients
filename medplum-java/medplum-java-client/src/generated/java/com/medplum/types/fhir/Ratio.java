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
    as = ImmutableRatio.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Ratio {
  Optional<String> id();

  Optional<Quantity> denominator();

  Optional<Quantity> numerator();

  Optional<List<Extension>> extension();

  static ImmutableRatio.Builder builder() {
    return ImmutableRatio.builder();
  }
}
