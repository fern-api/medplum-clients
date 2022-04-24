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
    as = ImmutableValueSet_Include.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Include {
  Optional<String> id();

  Optional<uri> system();

  Optional<String> version();

  Optional<List<ValueSet_Concept>> concept();

  Optional<List<Extension>> extension();

  Optional<List<ValueSet_Filter>> filter();

  Optional<List<canonical>> valueSet();

  Optional<List<Extension>> modifierExtension();

  static ImmutableValueSet_Include.Builder builder() {
    return ImmutableValueSet_Include.builder();
  }
}
