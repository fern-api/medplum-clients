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
    as = ImmutableMessageDefinition_AllowedResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageDefinition_AllowedResponse {
  Optional<Markdown> situation();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Canonical message();

  Optional<List<Extension>> extension();

  static ImmutableMessageDefinition_AllowedResponse.MessageBuildStage builder() {
    return ImmutableMessageDefinition_AllowedResponse.builder();
  }
}
