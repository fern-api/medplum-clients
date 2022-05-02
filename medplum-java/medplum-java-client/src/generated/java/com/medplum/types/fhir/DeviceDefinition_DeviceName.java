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
    as = ImmutableDeviceDefinition_DeviceName.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_DeviceName {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Devicedefinition_devicenameType> type();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDeviceDefinition_DeviceName.Builder builder() {
    return ImmutableDeviceDefinition_DeviceName.builder();
  }
}
