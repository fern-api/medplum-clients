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
    as = ImmutableAge.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Age {
  Optional<Uri> system();

  Optional<Code> code();

  Optional<String> unit();

  Optional<List<Extension>> extension();

  Optional<AgeComparator> comparator();

  Optional<Decimal> value();

  Optional<String> id();

  static ImmutableAge.Builder builder() {
    return ImmutableAge.builder();
  }
}
