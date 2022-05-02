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
    as = ImmutableDevice_UdiCarrier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_UdiCarrier {
  Optional<Uri> jurisdiction();

  Optional<String> deviceIdentifier();

  Optional<String> carrierHRF();

  Optional<String> id();

  Optional<Uri> issuer();

  Optional<List<Extension>> modifierExtension();

  Optional<Base64Binary> carrierAIDC();

  Optional<Device_udicarrierEntrytype> entryType();

  Optional<List<Extension>> extension();

  static ImmutableDevice_UdiCarrier.Builder builder() {
    return ImmutableDevice_UdiCarrier.builder();
  }
}
