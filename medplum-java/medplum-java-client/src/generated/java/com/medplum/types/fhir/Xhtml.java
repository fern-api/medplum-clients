package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableXhtml.class
)
public interface Xhtml {
  @JsonValue
  String value();

  static Xhtml valueOf(String value) {
    return ImmutableXhtml.builder().value(value).build();
  }
}
