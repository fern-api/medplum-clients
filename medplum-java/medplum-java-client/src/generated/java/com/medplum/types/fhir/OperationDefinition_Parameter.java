package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableOperationDefinition_Parameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OperationDefinition_Parameter {
  Optional<Code> name();

  Optional<List<Canonical>> targetProfile();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom();

  Optional<Integer> min();

  Optional<String> max();

  Optional<Operationdefinition_parameterSearchtype> searchType();

  Optional<String> documentation();

  Optional<List<OperationDefinition_Parameter>> part();

  Optional<List<Extension>> extension();

  Optional<OperationDefinition_Binding> binding();

  Optional<Operationdefinition_parameterUse> use();

  Optional<Code> type();

  static ImmutableOperationDefinition_Parameter.Builder builder() {
    return ImmutableOperationDefinition_Parameter.builder();
  }
}
