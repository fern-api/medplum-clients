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
    as = ImmutableSampledData.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SampledData {
  Optional<Decimal> period();

  Optional<String> data();

  Quantity origin();

  Optional<String> id();

  Optional<Decimal> upperLimit();

  Optional<PositiveInt> dimensions();

  Optional<Decimal> factor();

  Optional<Decimal> lowerLimit();

  Optional<List<Extension>> extension();

  static ImmutableSampledData.OriginBuildStage builder() {
    return ImmutableSampledData.builder();
  }
}
