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
    as = ImmutableElementDefinition_Binding.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ElementDefinition_Binding {
  Optional<String> description();

  Optional<String> id();

  Optional<Canonical> valueSet();

  Optional<List<Extension>> extension();

  Optional<Elementdefinition_bindingStrength> strength();

  Optional<List<Extension>> modifierExtension();

  static ImmutableElementDefinition_Binding.Builder builder() {
    return ImmutableElementDefinition_Binding.builder();
  }
}
