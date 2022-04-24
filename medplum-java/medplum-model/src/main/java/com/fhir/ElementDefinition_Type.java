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
    as = ImmutableElementDefinition_Type.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Type {
  Optional<String> id();

  Optional<uri> code();

  Optional<List<Extension>> extension();

  Optional<Elementdefinition_typeVersioning> versioning();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Elementdefinition_typeAggregationItem>> aggregation();

  Optional<List<canonical>> targetProfile();

  Optional<List<canonical>> profile();

  static ImmutableElementDefinition_Type.Builder builder() {
    return ImmutableElementDefinition_Type.builder();
  }
}
