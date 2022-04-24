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
    as = ImmutableDistance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Distance {
  Optional<String> unit();

  Optional<code> code();

  Optional<uri> system();

  Optional<DistanceComparator> comparator();

  Optional<List<Extension>> extension();

  Optional<decimal> value();

  Optional<String> id();

  static ImmutableDistance.Builder builder() {
    return ImmutableDistance.builder();
  }
}
