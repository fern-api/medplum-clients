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
    as = ImmutableBundle_Link.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Link {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> relation();

  Optional<uri> url();

  static ImmutableBundle_Link.Builder builder() {
    return ImmutableBundle_Link.builder();
  }
}
