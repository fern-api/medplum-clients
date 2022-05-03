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
    as = ImmutableCapabilityStatement_Endpoint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Endpoint {
  Coding protocol();

  Optional<List<Extension>> modifierExtension();

  Optional<Url> address();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableCapabilityStatement_Endpoint.ProtocolBuildStage builder() {
    return ImmutableCapabilityStatement_Endpoint.builder();
  }
}
