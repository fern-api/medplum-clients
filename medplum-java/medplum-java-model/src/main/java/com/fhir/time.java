package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTime.class
)
public interface time {
  @JsonValue
  String value();

  static time valueOf(String value) {
    return ImmutableTime.builder().value(value).build();
  }
}
