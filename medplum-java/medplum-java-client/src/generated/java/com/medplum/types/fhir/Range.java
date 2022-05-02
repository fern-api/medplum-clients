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
    as = ImmutableRange.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Range {
  Optional<List<Extension>> extension();

  Optional<Quantity> low();

  Optional<String> id();

  Optional<Quantity> high();

  static ImmutableRange.Builder builder() {
    return ImmutableRange.builder();
  }
}
