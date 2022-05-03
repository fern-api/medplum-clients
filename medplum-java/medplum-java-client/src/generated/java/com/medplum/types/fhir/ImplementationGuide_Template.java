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
    as = ImmutableImplementationGuide_Template.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Template {
  Optional<String> id();

  Optional<Code> code();

  Optional<String> scope();

  Optional<List<Extension>> extension();

  Optional<String> source();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImplementationGuide_Template.Builder builder() {
    return ImmutableImplementationGuide_Template.builder();
  }
}
