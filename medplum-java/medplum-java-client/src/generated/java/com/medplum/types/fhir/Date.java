package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDate.class
)
public interface Date {
  @JsonValue
  String value();

  static Date valueOf(String value) {
    return ImmutableDate.builder().value(value).build();
  }
}
