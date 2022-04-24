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
    as = ImmutableTerminologyCapabilities_CodeSystem.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_CodeSystem {
  Optional<List<TerminologyCapabilities_Version>> version();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> subsumption();

  Optional<canonical> uri();

  Optional<String> id();

  static ImmutableTerminologyCapabilities_CodeSystem.Builder builder() {
    return ImmutableTerminologyCapabilities_CodeSystem.builder();
  }
}
