package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCode.class
)
public interface code {
  @JsonValue
  String value();

  static code valueOf(String value) {
    return ImmutableCode.builder().value(value).build();
  }
}
