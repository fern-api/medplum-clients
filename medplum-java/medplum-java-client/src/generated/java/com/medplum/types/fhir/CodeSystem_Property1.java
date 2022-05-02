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
  Optional<String> valueCode();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Code> code();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueInteger();

  Optional<String> valueString();

  Optional<String> valueDateTime();

  Optional<Coding> valueCoding();

  Optional<Double> valueDecimal();

  static ImmutableCodeSystem_Property1.Builder builder() {
    return ImmutableCodeSystem_Property1.builder();
  }
}
