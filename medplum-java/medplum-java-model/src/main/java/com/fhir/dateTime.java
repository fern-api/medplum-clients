package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDateTime.class
)
public interface dateTime {
  @JsonValue
  String value();

  static dateTime valueOf(String value) {
    return ImmutableDateTime.builder().value(value).build();
  }
}
