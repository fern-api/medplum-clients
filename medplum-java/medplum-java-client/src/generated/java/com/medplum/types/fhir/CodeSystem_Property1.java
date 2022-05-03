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
    as = ImmutableCodeSystem_Property1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Property1 {
  Optional<Coding> valueCoding();

  Optional<String> id();

  Optional<String> valueDateTime();

  Optional<List<Extension>> extension();

  Optional<Double> valueInteger();

  Optional<String> valueString();

  Optional<Boolean> valueBoolean();

  Optional<Code> code();

  Optional<String> valueCode();

  Optional<Double> valueDecimal();

  Optional<List<Extension>> modifierExtension();

  static ImmutableCodeSystem_Property1.Builder builder() {
    return ImmutableCodeSystem_Property1.builder();
  }
}
