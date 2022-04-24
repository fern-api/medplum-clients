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
    as = ImmutableOperationDefinition_Binding.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition_Binding {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Operationdefinition_bindingStrength> strength();

  canonical valueSet();

  Optional<List<Extension>> extension();

  static ImmutableOperationDefinition_Binding.ValueSetBuildStage builder() {
    return ImmutableOperationDefinition_Binding.builder();
  }
}
