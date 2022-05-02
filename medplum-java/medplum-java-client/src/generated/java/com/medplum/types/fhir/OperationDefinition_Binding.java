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
    as = ImmutableOperationDefinition_Binding.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition_Binding {
  Optional<List<Extension>> modifierExtension();

  Optional<Operationdefinition_bindingStrength> strength();

  Optional<List<Extension>> extension();

  Canonical valueSet();

  Optional<String> id();

  static ImmutableOperationDefinition_Binding.ValueSetBuildStage builder() {
    return ImmutableOperationDefinition_Binding.builder();
  }
}
