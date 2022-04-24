package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMarkdown.class
)
public interface markdown {
  @JsonValue
  String value();

  static markdown valueOf(String value) {
    return ImmutableMarkdown.builder().value(value).build();
  }
}
