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
    as = ImmutableDataRequirement_Sort.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement_Sort {
  Optional<String> id();

  Optional<Datarequirement_sortDirection> direction();

  Optional<List<Extension>> modifierExtension();

  Optional<String> path();

  Optional<List<Extension>> extension();

  static ImmutableDataRequirement_Sort.Builder builder() {
    return ImmutableDataRequirement_Sort.builder();
  }
}