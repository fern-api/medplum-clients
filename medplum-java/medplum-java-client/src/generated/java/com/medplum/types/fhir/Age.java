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
  Optional<Decimal> value();

  Optional<Code> code();

  Optional<Uri> system();

  Optional<AgeComparator> comparator();

  Optional<String> id();

  Optional<String> unit();

  Optional<List<Extension>> extension();

  static ImmutableAge.Builder builder() {
    return ImmutableAge.builder();
  }
}
