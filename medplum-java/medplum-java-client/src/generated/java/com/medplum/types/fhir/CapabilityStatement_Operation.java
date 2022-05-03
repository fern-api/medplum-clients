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
    as = ImmutableCapabilityStatement_Operation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Operation {
  Optional<Markdown> documentation();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Canonical definition();

  static ImmutableCapabilityStatement_Operation.DefinitionBuildStage builder() {
    return ImmutableCapabilityStatement_Operation.builder();
  }
}
