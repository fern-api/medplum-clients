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
    as = ImmutableDeviceDefinition_UdiDeviceIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_UdiDeviceIdentifier {
  Optional<List<Extension>> modifierExtension();

  Optional<Uri> issuer();

  Optional<List<Extension>> extension();

  Optional<Uri> jurisdiction();

  Optional<String> deviceIdentifier();

  Optional<String> id();

  static ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder builder() {
    return ImmutableDeviceDefinition_UdiDeviceIdentifier.builder();
  }
}
