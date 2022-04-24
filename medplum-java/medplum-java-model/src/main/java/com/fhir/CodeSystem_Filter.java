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
    as = ImmutableCodeSystem_Filter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeSystem_Filter {
  Optional<String> value();

  Optional<List<Extension>> modifierExtension();

  Optional<List<code>> operator();

  Optional<List<Extension>> extension();

  Optional<code> code();

  Optional<String> id();

  Optional<String> description();

  static ImmutableCodeSystem_Filter.Builder builder() {
    return ImmutableCodeSystem_Filter.builder();
  }
}
