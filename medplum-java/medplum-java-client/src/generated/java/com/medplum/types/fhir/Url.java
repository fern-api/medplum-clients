package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUrl.class
)
public interface Url {
  @JsonValue
  String value();

  static Url valueOf(String value) {
    return ImmutableUrl.builder().value(value).build();
  }
}
