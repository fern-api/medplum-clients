package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<code> name();

  Optional<OperationDefinition_Binding> binding();

  Optional<List<OperationDefinition_ReferencedFrom>> referencedFrom();

  Optional<List<Extension>> modifierExtension();

  Optional<code> type();

  Optional<String> id();

  Optional<Operationdefinition_parameterUse> use();

  Optional<String> max();

  Optional<List<canonical>> targetProfile();

  Optional<String> documentation();

  Optional<Operationdefinition_parameterSearchtype> searchType();

  Optional<List<OperationDefinition_Parameter>> part();

  Optional<List<Extension>> extension();

  Optional<Integer> min();

  static ImmutableOperationDefinition_Parameter.Builder builder() {
    return ImmutableOperationDefinition_Parameter.builder();
  }
}
