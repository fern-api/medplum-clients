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
    as = ImmutableTerminologyCapabilities_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Parameter {
  Optional<List<Extension>> modifierExtension();

  Optional<String> documentation();

  Optional<List<Extension>> extension();

  Optional<Code> name();

  Optional<String> id();

  static ImmutableTerminologyCapabilities_Parameter.Builder builder() {
    return ImmutableTerminologyCapabilities_Parameter.builder();
  }
}
