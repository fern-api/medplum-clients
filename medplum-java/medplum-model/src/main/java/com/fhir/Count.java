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
    as = ImmutableCount.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Count {
  Optional<uri> system();

  Optional<String> unit();

  Optional<code> code();

  Optional<decimal> value();

  Optional<CountComparator> comparator();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableCount.Builder builder() {
    return ImmutableCount.builder();
  }
}
