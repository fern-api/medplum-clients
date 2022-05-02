package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUri.class
)
public interface Uri {
  @JsonValue
  String value();

  static Uri valueOf(String value) {
    return ImmutableUri.builder().value(value).build();
  }
}
