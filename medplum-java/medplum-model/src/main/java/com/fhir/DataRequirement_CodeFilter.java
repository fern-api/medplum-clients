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
    as = ImmutableDataRequirement_CodeFilter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement_CodeFilter {
  Optional<String> searchParam();

  Optional<String> path();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> code();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<canonical> valueSet();

  static ImmutableDataRequirement_CodeFilter.Builder builder() {
    return ImmutableDataRequirement_CodeFilter.builder();
  }
}
