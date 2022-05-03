package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableMolecularSequence_StructureVariant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_StructureVariant {
  Optional<Boolean> exact();

  Optional<Integer> length();

  Optional<MolecularSequence_Inner> inner();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> variantType();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<MolecularSequence_Outer> outer();

  static ImmutableMolecularSequence_StructureVariant.Builder builder() {
    return ImmutableMolecularSequence_StructureVariant.builder();
  }
}
