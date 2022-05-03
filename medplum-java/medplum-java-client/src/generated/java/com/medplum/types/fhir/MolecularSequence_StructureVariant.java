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

  Optional<List<Extension>> extension();

  Optional<Integer> length();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> variantType();

  Optional<MolecularSequence_Outer> outer();

  Optional<MolecularSequence_Inner> inner();

  static ImmutableMolecularSequence_StructureVariant.Builder builder() {
    return ImmutableMolecularSequence_StructureVariant.builder();
  }
}
