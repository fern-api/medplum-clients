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
    as = ImmutableStructureMap_Structure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Structure {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> alias();

  Optional<String> id();

  Optional<Structuremap_structureMode> mode();

  Optional<String> documentation();

  Canonical url();

  static ImmutableStructureMap_Structure.UrlBuildStage builder() {
    return ImmutableStructureMap_Structure.builder();
  }
}
