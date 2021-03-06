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
    as = ImmutableTerminologyCapabilities_Filter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Filter {
  Optional<String> id();

  Optional<Code> code();

  Optional<List<Extension>> extension();

  Optional<List<Code>> op();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTerminologyCapabilities_Filter.Builder builder() {
    return ImmutableTerminologyCapabilities_Filter.builder();
  }
}
