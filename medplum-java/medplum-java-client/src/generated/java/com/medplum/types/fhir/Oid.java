package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableOid.class
)
public interface Oid {
  @JsonValue
  String value();

  static Oid valueOf(String value) {
    return ImmutableOid.builder().value(value).build();
  }
}
