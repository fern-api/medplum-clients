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
    as = ImmutableAge.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Age {
  Optional<String> unit();

  Optional<uri> system();

  Optional<List<Extension>> extension();

  Optional<decimal> value();

  Optional<code> code();

  Optional<AgeComparator> comparator();

  Optional<String> id();

  static ImmutableAge.Builder builder() {
    return ImmutableAge.builder();
  }
}
