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
    as = ImmutableStructureMap_Input.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Input {
  Optional<List<Extension>> modifierExtension();

  Optional<Structuremap_inputMode> mode();

  Optional<String> documentation();

  Optional<String> type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<id> name();

  static ImmutableStructureMap_Input.Builder builder() {
    return ImmutableStructureMap_Input.builder();
  }
}
