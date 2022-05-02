package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUuid.class
)
public interface Uuid {
  @JsonValue
  String value();

  static Uuid valueOf(String value) {
    return ImmutableUuid.builder().value(value).build();
  }
}
