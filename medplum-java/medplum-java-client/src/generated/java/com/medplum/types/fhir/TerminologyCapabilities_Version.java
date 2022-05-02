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
    as = ImmutableTerminologyCapabilities_Version.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Version {
  Optional<List<Extension>> extension();

  Optional<Boolean> isDefault();

  Optional<List<TerminologyCapabilities_Filter>> filter();

  Optional<String> code();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Code>> language();

  Optional<List<Code>> property();

  Optional<Boolean> compositional();

  static ImmutableTerminologyCapabilities_Version.Builder builder() {
    return ImmutableTerminologyCapabilities_Version.builder();
  }
}
