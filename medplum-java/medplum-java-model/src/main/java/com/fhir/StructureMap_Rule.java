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
    as = ImmutableStructureMap_Rule.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Rule {
  Optional<List<Extension>> extension();

  List<StructureMap_Source> source();

  Optional<List<Extension>> modifierExtension();

  Optional<id> name();

  Optional<List<StructureMap_Rule>> rule();

  Optional<String> id();

  Optional<List<StructureMap_Target>> target();

  Optional<String> documentation();

  Optional<List<StructureMap_Dependent>> dependent();

  static ImmutableStructureMap_Rule.Builder builder() {
    return ImmutableStructureMap_Rule.builder();
  }
}
