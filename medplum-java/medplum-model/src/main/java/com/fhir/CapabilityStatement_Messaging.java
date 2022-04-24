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
    as = ImmutableCapabilityStatement_Messaging.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Messaging {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<unsignedInt> reliableCache();

  Optional<List<CapabilityStatement_SupportedMessage>> supportedMessage();

  Optional<List<Extension>> extension();

  Optional<List<CapabilityStatement_Endpoint>> endpoint();

  Optional<markdown> documentation();

  static ImmutableCapabilityStatement_Messaging.Builder builder() {
    return ImmutableCapabilityStatement_Messaging.builder();
  }
}
