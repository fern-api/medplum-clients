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
    as = ImmutableDeviceDefinition_UdiDeviceIdentifier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DeviceDefinition_UdiDeviceIdentifier {
  Optional<List<Extension>> extension();

  Optional<uri> issuer();

  Optional<List<Extension>> modifierExtension();

  Optional<String> deviceIdentifier();

  Optional<uri> jurisdiction();

  Optional<String> id();

  static ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder builder() {
    return ImmutableDeviceDefinition_UdiDeviceIdentifier.builder();
  }
}
