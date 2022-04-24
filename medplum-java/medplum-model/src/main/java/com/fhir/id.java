package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableId.class
)
public interface id {
  @JsonValue
  String value();

  static id valueOf(String value) {
    return ImmutableId.builder().value(value).build();
  }
}
