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
    as = ImmutableTerminologyCapabilities_Software.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Software {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<String> version();

  Optional<List<Extension>> extension();

  static ImmutableTerminologyCapabilities_Software.Builder builder() {
    return ImmutableTerminologyCapabilities_Software.builder();
  }
}
