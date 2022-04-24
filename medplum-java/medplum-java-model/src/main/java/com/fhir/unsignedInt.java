package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUnsignedInt.class
)
public interface unsignedInt {
  @JsonValue
  int value();

  static unsignedInt valueOf(int value) {
    return ImmutableUnsignedInt.builder().value(value).build();
  }
}
