package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableStructureMap_Group.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Group {
  @JsonProperty("extends")
  Optional<id> _extends();

  Optional<String> documentation();

  List<StructureMap_Input> input();

  Optional<List<Extension>> modifierExtension();

  Optional<id> name();

  Optional<Structuremap_groupTypemode> typeMode();

  List<StructureMap_Rule> rule();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableStructureMap_Group.Builder builder() {
    return ImmutableStructureMap_Group.builder();
  }
}
