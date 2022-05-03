package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> subsumption();

  Optional<List<TerminologyCapabilities_Version>> version();

  Optional<List<Extension>> extension();

  Optional<Canonical> uri();

  static ImmutableTerminologyCapabilities_CodeSystem.Builder builder() {
    return ImmutableTerminologyCapabilities_CodeSystem.builder();
  }
}
