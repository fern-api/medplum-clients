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
    as = ImmutableCapabilityStatement_SupportedMessage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_SupportedMessage {
  Optional<Capabilitystatement_supportedmessageMode> mode();

  Optional<List<Extension>> modifierExtension();

  canonical definition();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableCapabilityStatement_SupportedMessage.DefinitionBuildStage builder() {
    return ImmutableCapabilityStatement_SupportedMessage.builder();
  }
}
