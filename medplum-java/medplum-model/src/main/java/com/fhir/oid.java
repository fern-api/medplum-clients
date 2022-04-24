package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableOid.class
)
public interface oid {
  @JsonValue
  String value();

  static oid valueOf(String value) {
    return ImmutableOid.builder().value(value).build();
  }
}
