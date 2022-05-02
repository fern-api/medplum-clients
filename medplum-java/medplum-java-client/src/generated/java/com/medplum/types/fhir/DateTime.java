package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDateTime.class
)
public interface DateTime {
  @JsonValue
  String value();

  static DateTime valueOf(String value) {
    return ImmutableDateTime.builder().value(value).build();
  }
}
