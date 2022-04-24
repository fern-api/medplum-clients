package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUri.class
)
public interface uri {
  @JsonValue
  String value();

  static uri valueOf(String value) {
    return ImmutableUri.builder().value(value).build();
  }
}
