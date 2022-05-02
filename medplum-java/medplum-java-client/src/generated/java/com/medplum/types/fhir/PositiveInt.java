package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePositiveInt.class
)
public interface PositiveInt {
  @JsonValue
  int value();

  static PositiveInt valueOf(int value) {
    return ImmutablePositiveInt.builder().value(value).build();
  }
}
