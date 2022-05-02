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

  Optional<Double> valueInteger();

  Optional<List<Extension>> extension();

  Optional<Boolean> valueBoolean();

  Optional<String> valueId();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueDecimal();

  Optional<String> id();

  static ImmutableStructureMap_Parameter.Builder builder() {
    return ImmutableStructureMap_Parameter.builder();
  }
}
