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
    as = ImmutableDeviceDefinition_Capability.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_Capability {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<CodeableConcept>> description();

  Optional<List<Extension>> extension();

  CodeableConcept type();

  static ImmutableDeviceDefinition_Capability.TypeBuildStage builder() {
    return ImmutableDeviceDefinition_Capability.builder();
  }
}
