package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUrl.class
)
public interface url {
  @JsonValue
  String value();

  static url valueOf(String value) {
    return ImmutableUrl.builder().value(value).build();
  }
}
