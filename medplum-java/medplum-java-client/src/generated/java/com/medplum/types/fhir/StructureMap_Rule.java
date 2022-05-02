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
    as = ImmutableStructureMap_Rule.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureMap_Rule {
  Optional<List<StructureMap_Dependent>> dependent();

  Optional<Id> name();

  Optional<List<Extension>> extension();

  Optional<String> documentation();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<StructureMap_Target>> target();

  List<StructureMap_Source> source();

  Optional<List<StructureMap_Rule>> rule();

  static ImmutableStructureMap_Rule.Builder builder() {
    return ImmutableStructureMap_Rule.builder();
  }
}
