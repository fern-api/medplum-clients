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
    as = ImmutableDataRequirement_CodeFilter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement_CodeFilter {
  Optional<String> searchParam();

  Optional<String> id();

  Optional<String> path();

  Optional<Canonical> valueSet();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> code();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDataRequirement_CodeFilter.Builder builder() {
    return ImmutableDataRequirement_CodeFilter.builder();
  }
}
