package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableRefreshToken.class
)
public interface RefreshToken {
  @JsonValue
  String value();

  static RefreshToken valueOf(String value) {
    return ImmutableRefreshToken.builder().value(value).build();
  }
}
