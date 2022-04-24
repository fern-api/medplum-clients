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
    as = ImmutableStructureMap_Structure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Structure {
  canonical url();

  Optional<String> documentation();

  Optional<Structuremap_structureMode> mode();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> alias();

  static ImmutableStructureMap_Structure.UrlBuildStage builder() {
    return ImmutableStructureMap_Structure.builder();
  }
}
