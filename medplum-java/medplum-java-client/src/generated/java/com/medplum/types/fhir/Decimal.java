package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDecimal.class
)
public interface Decimal {
  @JsonValue
  double value();

  static Decimal valueOf(double value) {
    return ImmutableDecimal.builder().value(value).build();
  }
}
