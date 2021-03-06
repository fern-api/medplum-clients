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
    as = ImmutableElementDefinition_Discriminator.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Discriminator {
  Optional<List<Extension>> extension();

  Optional<String> path();

  Optional<Elementdefinition_discriminatorType> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableElementDefinition_Discriminator.Builder builder() {
    return ImmutableElementDefinition_Discriminator.builder();
  }
}
