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
    as = ImmutableElementDefinition_Slicing.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Slicing {
  Optional<List<ElementDefinition_Discriminator>> discriminator();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Elementdefinition_slicingRules> rules();

  Optional<Boolean> ordered();

  Optional<String> id();

  Optional<String> description();

  static ImmutableElementDefinition_Slicing.Builder builder() {
    return ImmutableElementDefinition_Slicing.builder();
  }
}
