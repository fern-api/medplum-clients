package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMarkdown.class
)
public interface Markdown {
  @JsonValue
  String value();

  static Markdown valueOf(String value) {
    return ImmutableMarkdown.builder().value(value).build();
  }
}
