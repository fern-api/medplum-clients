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
    as = ImmutableDataRequirement_Sort.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement_Sort {
  Optional<Datarequirement_sortDirection> direction();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> path();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDataRequirement_Sort.Builder builder() {
    return ImmutableDataRequirement_Sort.builder();
  }
}
