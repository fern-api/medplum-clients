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
    as = ImmutableDeviceDefinition_Specialization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_Specialization {
  Optional<String> systemType();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableDeviceDefinition_Specialization.Builder builder() {
    return ImmutableDeviceDefinition_Specialization.builder();
  }
}
