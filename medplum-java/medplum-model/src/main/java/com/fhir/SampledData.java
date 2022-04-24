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
    as = ImmutableSampledData.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SampledData {
  Optional<String> id();

  Optional<decimal> upperLimit();

  Optional<decimal> factor();

  Quantity origin();

  Optional<List<Extension>> extension();

  Optional<String> data();

  Optional<decimal> period();

  Optional<decimal> lowerLimit();

  Optional<positiveInt> dimensions();

  static ImmutableSampledData.OriginBuildStage builder() {
    return ImmutableSampledData.builder();
  }
}
