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
    as = ImmutableDevice_DeviceName.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_DeviceName {
  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Device_devicenameType> type();

  static ImmutableDevice_DeviceName.Builder builder() {
    return ImmutableDevice_DeviceName.builder();
  }
}
