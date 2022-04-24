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
    as = ImmutableDevice_UdiCarrier.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Device_UdiCarrier {
  Optional<Device_udicarrierEntrytype> entryType();

  Optional<String> id();

  Optional<uri> issuer();

  Optional<uri> jurisdiction();

  Optional<base64Binary> carrierAIDC();

  Optional<String> deviceIdentifier();

  Optional<String> carrierHRF();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDevice_UdiCarrier.Builder builder() {
    return ImmutableDevice_UdiCarrier.builder();
  }
}
