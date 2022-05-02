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
    as = ImmutableValueSet_Include.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Include {
  Optional<List<Extension>> modifierExtension();

  Optional<Uri> system();

  Optional<List<Extension>> extension();

  Optional<String> version();

  Optional<String> id();

  Optional<List<ValueSet_Concept>> concept();

  Optional<List<Canonical>> valueSet();

  Optional<List<ValueSet_Filter>> filter();

  static ImmutableValueSet_Include.Builder builder() {
    return ImmutableValueSet_Include.builder();
  }
}
