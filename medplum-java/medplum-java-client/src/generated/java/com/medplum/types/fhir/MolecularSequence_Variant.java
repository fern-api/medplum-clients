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
    as = ImmutableMolecularSequence_Variant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Variant {
  Optional<String> id();

  Optional<String> cigar();

  Optional<Integer> end();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Integer> start();

  Optional<String> referenceAllele();

  Optional<Reference> variantPointer();

  Optional<String> observedAllele();

  static ImmutableMolecularSequence_Variant.Builder builder() {
    return ImmutableMolecularSequence_Variant.builder();
  }
}
