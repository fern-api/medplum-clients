package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTerminologyCapabilities_Translation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Translation {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Boolean> needsMap();

  Optional<List<Extension>> extension();

  static ImmutableTerminologyCapabilities_Translation.Builder builder() {
    return ImmutableTerminologyCapabilities_Translation.builder();
  }
}
