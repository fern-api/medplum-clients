package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCanonical.class
)
public interface canonical {
  @JsonValue
  String value();

  static canonical valueOf(String value) {
    return ImmutableCanonical.builder().value(value).build();
  }
}
