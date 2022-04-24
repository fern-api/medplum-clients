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
    as = ImmutableMessageDefinition_AllowedResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MessageDefinition_AllowedResponse {
  canonical message();

  Optional<List<Extension>> extension();

  Optional<markdown> situation();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableMessageDefinition_AllowedResponse.MessageBuildStage builder() {
    return ImmutableMessageDefinition_AllowedResponse.builder();
  }
}
