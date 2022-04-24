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
    as = ImmutableDeviceDefinition_DeviceName.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_DeviceName {
  Optional<String> id();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Devicedefinition_devicenameType> type();

  static ImmutableDeviceDefinition_DeviceName.Builder builder() {
    return ImmutableDeviceDefinition_DeviceName.builder();
  }
}
