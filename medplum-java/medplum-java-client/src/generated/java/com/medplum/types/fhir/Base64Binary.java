package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBase64Binary.class
)
public interface Base64Binary {
  @JsonValue
  String value();

  static Base64Binary valueOf(String value) {
    return ImmutableBase64Binary.builder().value(value).build();
  }
}
