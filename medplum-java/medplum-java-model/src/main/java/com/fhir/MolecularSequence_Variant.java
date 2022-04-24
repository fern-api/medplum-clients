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
    as = ImmutableMolecularSequence_Variant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Variant {
  Optional<String> id();

  Optional<Reference> variantPointer();

  Optional<Integer> start();

  Optional<String> referenceAllele();

  Optional<String> observedAllele();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> cigar();

  Optional<Integer> end();

  static ImmutableMolecularSequence_Variant.Builder builder() {
    return ImmutableMolecularSequence_Variant.builder();
  }
}
