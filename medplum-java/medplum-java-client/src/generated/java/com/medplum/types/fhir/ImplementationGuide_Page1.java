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
    as = ImmutableImplementationGuide_Page1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Page1 {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<List<String>> anchor();

  Optional<String> name();

  Optional<String> title();

  static ImmutableImplementationGuide_Page1.Builder builder() {
    return ImmutableImplementationGuide_Page1.builder();
  }
}
