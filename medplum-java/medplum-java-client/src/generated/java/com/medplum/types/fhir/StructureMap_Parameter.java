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
  Optional<List<Extension>> modifierExtension();

  Optional<String> valueId();

  Optional<Double> valueDecimal();

  Optional<String> valueString();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Double> valueInteger();

  Optional<Boolean> valueBoolean();

  static ImmutableStructureMap_Parameter.Builder builder() {
    return ImmutableStructureMap_Parameter.builder();
  }
}
