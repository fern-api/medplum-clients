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
    as = ImmutableStructureMap_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Parameter {
  Optional<Double> valueInteger();

  Optional<String> valueId();

  Optional<String> valueString();

  Optional<List<Extension>> extension();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Double> valueDecimal();

  static ImmutableStructureMap_Parameter.Builder builder() {
    return ImmutableStructureMap_Parameter.builder();
  }
}
