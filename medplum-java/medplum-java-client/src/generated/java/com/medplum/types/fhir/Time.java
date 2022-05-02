package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTime.class
)
public interface Time {
  @JsonValue
  String value();

  static Time valueOf(String value) {
    return ImmutableTime.builder().value(value).build();
  }
}
