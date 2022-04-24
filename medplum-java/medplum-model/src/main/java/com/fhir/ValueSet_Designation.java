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
    as = ImmutableValueSet_Designation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ValueSet_Designation {
  Optional<String> value();

  Optional<code> language();

  Optional<String> id();

  Optional<Coding> use();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableValueSet_Designation.Builder builder() {
    return ImmutableValueSet_Designation.builder();
  }
}
