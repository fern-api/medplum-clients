package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUuid.class
)
public interface uuid {
  @JsonValue
  String value();

  static uuid valueOf(String value) {
    return ImmutableUuid.builder().value(value).build();
  }
}
