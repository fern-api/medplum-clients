package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutablePositiveInt.class
)
public interface positiveInt {
  @JsonValue
  int value();

  static positiveInt valueOf(int value) {
    return ImmutablePositiveInt.builder().value(value).build();
  }
}
