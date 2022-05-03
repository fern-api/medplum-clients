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
  Optional<Id> id();

  Optional<String> valueCode();

  Optional<Double> valueInteger();

  Optional<String> valueString();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueDecimal();

  static ImmutableUserConfiguration_Option.Builder builder() {
    return ImmutableUserConfiguration_Option.builder();
  }
}
