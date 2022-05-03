package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Structuremap_groupTypemode> typeMode();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  List<StructureMap_Input> input();

  Optional<String> documentation();

  List<StructureMap_Rule> rule();

  Optional<String> id();

  Optional<Id> name();

  @JsonProperty("extends")
  Optional<Id> _extends();

  static ImmutableStructureMap_Group.Builder builder() {
    return ImmutableStructureMap_Group.builder();
  }
}
