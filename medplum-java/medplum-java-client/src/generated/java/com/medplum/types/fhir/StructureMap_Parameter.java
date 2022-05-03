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
    as = ImmutableStructureMap_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Parameter {
  Optional<String> valueString();

  Optional<List<Extension>> extension();

  Optional<Double> valueDecimal();

  Optional<String> id();

  Optional<String> valueId();

  Optional<Double> valueInteger();

  Optional<Boolean> valueBoolean();

  Optional<List<Extension>> modifierExtension();

  static ImmutableStructureMap_Parameter.Builder builder() {
    return ImmutableStructureMap_Parameter.builder();
  }
}
