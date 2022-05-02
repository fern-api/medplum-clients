package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCanonical.class
)
public interface Canonical {
  @JsonValue
  String value();

  static Canonical valueOf(String value) {
    return ImmutableCanonical.builder().value(value).build();
  }
}
