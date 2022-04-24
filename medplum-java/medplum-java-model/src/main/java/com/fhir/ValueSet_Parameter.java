package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<String> valueDateTime();

  Optional<String> valueCode();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueDecimal();

  Optional<String> valueString();

  Optional<String> valueUri();

  Optional<String> id();

  static ImmutableValueSet_Parameter.Builder builder() {
    return ImmutableValueSet_Parameter.builder();
  }
}
