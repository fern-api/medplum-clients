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
    as = ImmutableElementDefinition_Slicing.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Slicing {
  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> ordered();

  Optional<Elementdefinition_slicingRules> rules();

  Optional<List<ElementDefinition_Discriminator>> discriminator();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableElementDefinition_Slicing.Builder builder() {
    return ImmutableElementDefinition_Slicing.builder();
  }
}
