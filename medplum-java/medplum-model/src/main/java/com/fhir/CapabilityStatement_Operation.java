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
    as = ImmutableCapabilityStatement_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Operation {
  Optional<markdown> documentation();

  Optional<List<Extension>> modifierExtension();

  canonical definition();

  Optional<String> name();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableCapabilityStatement_Operation.DefinitionBuildStage builder() {
    return ImmutableCapabilityStatement_Operation.builder();
  }
}
