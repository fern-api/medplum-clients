package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUnsignedInt.class
)
public interface UnsignedInt {
  @JsonValue
  int value();

  static UnsignedInt valueOf(int value) {
    return ImmutableUnsignedInt.builder().value(value).build();
  }
}
