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
    as = ImmutableTerminologyCapabilities_Implementation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Implementation {
  Optional<String> id();

  Optional<Url> url();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<String> description();

  static ImmutableTerminologyCapabilities_Implementation.Builder builder() {
    return ImmutableTerminologyCapabilities_Implementation.builder();
  }
}
