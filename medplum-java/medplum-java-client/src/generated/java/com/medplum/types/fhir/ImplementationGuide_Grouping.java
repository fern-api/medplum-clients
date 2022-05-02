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
    as = ImmutableImplementationGuide_Grouping.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Grouping {
  Optional<List<Extension>> extension();

  Optional<String> name();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImplementationGuide_Grouping.Builder builder() {
    return ImmutableImplementationGuide_Grouping.builder();
  }
}
