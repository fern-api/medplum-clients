package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<List<Extension>> extension();

  Optional<String> source();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> scope();

  Optional<code> code();

  static ImmutableImplementationGuide_Template.Builder builder() {
    return ImmutableImplementationGuide_Template.builder();
  }
}
