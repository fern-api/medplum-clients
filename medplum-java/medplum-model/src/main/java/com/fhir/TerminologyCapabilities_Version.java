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
    as = ImmutableTerminologyCapabilities_Version.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TerminologyCapabilities_Version {
  Optional<List<code>> language();

  Optional<Boolean> isDefault();

  Optional<List<Extension>> modifierExtension();

  Optional<List<code>> property();

  Optional<String> code();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Boolean> compositional();

  Optional<List<TerminologyCapabilities_Filter>> filter();

  static ImmutableTerminologyCapabilities_Version.Builder builder() {
    return ImmutableTerminologyCapabilities_Version.builder();
  }
}
