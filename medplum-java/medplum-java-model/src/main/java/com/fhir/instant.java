package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableInstant.class
)
public interface instant {
  @JsonValue
  String value();

  static instant valueOf(String value) {
    return ImmutableInstant.builder().value(value).build();
  }
}
