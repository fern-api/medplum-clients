package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableUserConfiguration_Option.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface UserConfiguration_Option {
  Optional<String> valueCode();

  Optional<Double> valueDecimal();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<Id> id();

  Optional<String> valueString();

  static ImmutableUserConfiguration_Option.Builder builder() {
    return ImmutableUserConfiguration_Option.builder();
  }
}
