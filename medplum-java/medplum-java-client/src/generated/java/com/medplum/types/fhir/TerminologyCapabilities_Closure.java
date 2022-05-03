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
    as = ImmutableTerminologyCapabilities_Closure.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Closure {
  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> translation();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableTerminologyCapabilities_Closure.Builder builder() {
    return ImmutableTerminologyCapabilities_Closure.builder();
  }
}
