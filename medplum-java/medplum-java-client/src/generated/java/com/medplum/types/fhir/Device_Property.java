package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> valueCode();

  Optional<List<Quantity>> valueQuantity();

  Optional<String> id();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  static ImmutableDevice_Property.TypeBuildStage builder() {
    return ImmutableDevice_Property.builder();
  }
}
