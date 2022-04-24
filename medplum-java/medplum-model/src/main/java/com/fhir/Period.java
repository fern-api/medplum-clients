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
    as = ImmutablePeriod.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Period {
  Optional<dateTime> end();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<dateTime> start();

  static ImmutablePeriod.Builder builder() {
    return ImmutablePeriod.builder();
  }
}
