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
  Optional<List<Extension>> extension();

  Optional<Device_udicarrierEntrytype> entryType();

  Optional<List<Extension>> modifierExtension();

  Optional<String> deviceIdentifier();

  Optional<Uri> jurisdiction();

  Optional<Uri> issuer();

  Optional<Base64Binary> carrierAIDC();

  Optional<String> carrierHRF();

  Optional<String> id();

  static ImmutableDevice_UdiCarrier.Builder builder() {
    return ImmutableDevice_UdiCarrier.builder();
  }
}
