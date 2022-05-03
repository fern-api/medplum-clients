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
    as = ImmutableStructureDefinition_Snapshot.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface StructureDefinition_Snapshot {
  Optional<String> id();

  List<ElementDefinition> element();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableStructureDefinition_Snapshot.Builder builder() {
    return ImmutableStructureDefinition_Snapshot.builder();
  }
}
