package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCode.class
)
public interface Code {
  @JsonValue
  String value();

  static Code valueOf(String value) {
    return ImmutableCode.builder().value(value).build();
  }
}
