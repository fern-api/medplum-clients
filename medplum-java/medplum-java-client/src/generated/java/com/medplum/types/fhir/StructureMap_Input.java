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
    as = ImmutableStructureMap_Input.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Input {
  Optional<String> documentation();

  Optional<Id> name();

  Optional<Structuremap_inputMode> mode();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> type();

  Optional<List<Extension>> extension();

  static ImmutableStructureMap_Input.Builder builder() {
    return ImmutableStructureMap_Input.builder();
  }
}
