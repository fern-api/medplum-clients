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
    as = ImmutableCodeSystem_Property1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Property1 {
  Optional<List<Extension>> extension();

  Optional<code> code();

  Optional<String> id();

  Optional<String> valueCode();

  Optional<Double> valueDecimal();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> valueBoolean();

  Optional<Coding> valueCoding();

  Optional<String> valueString();

  Optional<Double> valueInteger();

  Optional<String> valueDateTime();

  static ImmutableCodeSystem_Property1.Builder builder() {
    return ImmutableCodeSystem_Property1.builder();
  }
}
