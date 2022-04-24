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
    as = ImmutableDevice_DeviceName.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_DeviceName {
  Optional<String> id();

  Optional<String> name();

  Optional<Device_devicenameType> type();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDevice_DeviceName.Builder builder() {
    return ImmutableDevice_DeviceName.builder();
  }
}
