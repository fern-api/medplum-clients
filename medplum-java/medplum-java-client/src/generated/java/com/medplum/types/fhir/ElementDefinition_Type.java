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
    as = ImmutableElementDefinition_Type.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Type {
  Optional<Uri> code();

  Optional<List<Canonical>> targetProfile();

  Optional<List<Elementdefinition_typeAggregationItem>> aggregation();

  Optional<Elementdefinition_typeVersioning> versioning();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Canonical>> profile();

  static ImmutableElementDefinition_Type.Builder builder() {
    return ImmutableElementDefinition_Type.builder();
  }
}
