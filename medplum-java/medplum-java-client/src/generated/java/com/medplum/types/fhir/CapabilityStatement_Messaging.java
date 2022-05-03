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
    as = ImmutableCapabilityStatement_Messaging.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Messaging {
  Optional<List<Extension>> modifierExtension();

  Optional<List<CapabilityStatement_SupportedMessage>> supportedMessage();

  Optional<String> id();

  Optional<UnsignedInt> reliableCache();

  Optional<Markdown> documentation();

  Optional<List<Extension>> extension();

  Optional<List<CapabilityStatement_Endpoint>> endpoint();

  static ImmutableCapabilityStatement_Messaging.Builder builder() {
    return ImmutableCapabilityStatement_Messaging.builder();
  }
}
