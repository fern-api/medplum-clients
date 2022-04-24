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
    as = ImmutableDeviceDefinition_Capability.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_Capability {
  Optional<List<Extension>> modifierExtension();

  CodeableConcept type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<CodeableConcept>> description();

  static ImmutableDeviceDefinition_Capability.TypeBuildStage builder() {
    return ImmutableDeviceDefinition_Capability.builder();
  }
}
