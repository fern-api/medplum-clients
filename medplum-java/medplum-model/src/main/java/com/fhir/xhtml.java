package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableXhtml.class
)
public interface xhtml {
  @JsonValue
  String value();

  static xhtml valueOf(String value) {
    return ImmutableXhtml.builder().value(value).build();
  }
}
