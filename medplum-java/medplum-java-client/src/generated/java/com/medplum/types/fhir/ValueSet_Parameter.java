package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableValueSet_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Parameter {
  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<String> valueUri();

  Optional<String> valueDateTime();

  Optional<String> id();

  Optional<String> valueString();

  Optional<List<Extension>> extension();

  Optional<Double> valueInteger();

  Optional<String> valueCode();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueDecimal();

  static ImmutableValueSet_Parameter.Builder builder() {
    return ImmutableValueSet_Parameter.builder();
  }
}