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
    as = ImmutableCapabilityStatement_SupportedMessage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_SupportedMessage {
  Optional<String> id();

  Optional<Capabilitystatement_supportedmessageMode> mode();

  Optional<List<Extension>> modifierExtension();

  Canonical definition();

  Optional<List<Extension>> extension();

  static ImmutableCapabilityStatement_SupportedMessage.DefinitionBuildStage builder() {
    return ImmutableCapabilityStatement_SupportedMessage.builder();
  }
}
