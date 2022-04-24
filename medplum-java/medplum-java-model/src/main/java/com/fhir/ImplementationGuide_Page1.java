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
    as = ImmutableImplementationGuide_Page1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Page1 {
  Optional<String> name();

  Optional<List<String>> anchor();

  Optional<List<Extension>> modifierExtension();

  Optional<String> title();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableImplementationGuide_Page1.Builder builder() {
    return ImmutableImplementationGuide_Page1.builder();
  }
}
