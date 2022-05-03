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
    as = ImmutableCount.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Count {
  Optional<List<Extension>> extension();

  Optional<Uri> system();

  Optional<Code> code();

  Optional<Decimal> value();

  Optional<CountComparator> comparator();

  Optional<String> unit();

  Optional<String> id();

  static ImmutableCount.Builder builder() {
    return ImmutableCount.builder();
  }
}
