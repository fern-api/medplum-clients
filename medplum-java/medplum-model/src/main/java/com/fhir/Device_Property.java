package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableDevice_Property.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_Property {
  Optional<List<CodeableConcept>> valueCode();

  Optional<List<Quantity>> valueQuantity();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  Optional<String> id();

  static ImmutableDevice_Property.TypeBuildStage builder() {
    return ImmutableDevice_Property.builder();
  }
}
