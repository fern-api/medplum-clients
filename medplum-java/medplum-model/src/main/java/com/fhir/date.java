package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDate.class
)
public interface date {
  @JsonValue
  String value();

  static date valueOf(String value) {
    return ImmutableDate.builder().value(value).build();
  }
}
