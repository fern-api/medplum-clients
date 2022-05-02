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
  Optional<String> carrierHRF();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Base64Binary> carrierAIDC();

  Optional<Uri> jurisdiction();

  Optional<String> id();

  Optional<String> deviceIdentifier();

  Optional<Device_udicarrierEntrytype> entryType();

  Optional<Uri> issuer();

  static ImmutableDevice_UdiCarrier.Builder builder() {
    return ImmutableDevice_UdiCarrier.builder();
  }
}
