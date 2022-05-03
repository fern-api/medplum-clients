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
  Optional<String> max();

  Optional<Integer> min();

  Optional<String> documentation();

  Optional<OperationDefinition_Binding> binding();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> name();

  Optional<Operationdefinition_parameterSearchtype> searchType();

  Optional<String> id();

  Optional<Code> type();

  Optional<List<Extension>> extension();

  Optional<List<OperationDefinition_Parameter>> part();

  Optional<List<Canonical>> targetProfile();

  Optional<Operationdefinition_parameterUse> use();

  Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom();

  static ImmutableOperationDefinition_Parameter.Builder builder() {
    return ImmutableOperationDefinition_Parameter.builder();
  }
}
