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
    as = ImmutablePeriod.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Period {
  Optional<DateTime> end();

  Optional<DateTime> start();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutablePeriod.Builder builder() {
    return ImmutablePeriod.builder();
  }
}
