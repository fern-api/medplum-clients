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
    as = ImmutableDuration.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Duration {
  Optional<Uri> system();

  Optional<String> unit();

  Optional<Code> code();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Decimal> value();

  Optional<DurationComparator> comparator();

  static ImmutableDuration.Builder builder() {
    return ImmutableDuration.builder();
  }
}
