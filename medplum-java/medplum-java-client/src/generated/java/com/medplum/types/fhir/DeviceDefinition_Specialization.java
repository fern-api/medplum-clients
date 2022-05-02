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
    as = ImmutableDeviceDefinition_Specialization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_Specialization {
  Optional<List<Extension>> extension();

  Optional<String> systemType();

  Optional<String> id();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDeviceDefinition_Specialization.Builder builder() {
    return ImmutableDeviceDefinition_Specialization.builder();
  }
}
