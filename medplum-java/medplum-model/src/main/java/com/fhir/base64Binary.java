package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBase64Binary.class
)
public interface base64Binary {
  @JsonValue
  String value();

  static base64Binary valueOf(String value) {
    return ImmutableBase64Binary.builder().value(value).build();
  }
}
