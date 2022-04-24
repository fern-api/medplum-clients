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
    as = ImmutableDuration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Duration {
  Optional<uri> system();

  Optional<code> code();

  Optional<List<Extension>> extension();

  Optional<decimal> value();

  Optional<String> id();

  Optional<String> unit();

  Optional<DurationComparator> comparator();

  static ImmutableDuration.Builder builder() {
    return ImmutableDuration.builder();
  }
}
