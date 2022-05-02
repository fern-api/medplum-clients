package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableInstant.class
)
public interface Instant {
  @JsonValue
  String value();

  static Instant valueOf(String value) {
    return ImmutableInstant.builder().value(value).build();
  }
}
