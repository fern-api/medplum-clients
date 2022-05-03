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
    as = ImmutableDeviceDefinition_Property.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_Property {
  CodeableConcept type();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> valueCode();

  Optional<List<Quantity>> valueQuantity();

  static ImmutableDeviceDefinition_Property.TypeBuildStage builder() {
    return ImmutableDeviceDefinition_Property.builder();
  }
}
