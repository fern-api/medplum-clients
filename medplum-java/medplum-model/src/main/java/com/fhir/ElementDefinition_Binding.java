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
    as = ImmutableElementDefinition_Binding.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Binding {
  Optional<List<Extension>> modifierExtension();

  Optional<Elementdefinition_bindingStrength> strength();

  Optional<String> description();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<canonical> valueSet();

  static ImmutableElementDefinition_Binding.Builder builder() {
    return ImmutableElementDefinition_Binding.builder();
  }
}
