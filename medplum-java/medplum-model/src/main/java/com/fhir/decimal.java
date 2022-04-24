package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDecimal.class
)
public interface decimal {
  @JsonValue
  double value();

  static decimal valueOf(double value) {
    return ImmutableDecimal.builder().value(value).build();
  }
}
