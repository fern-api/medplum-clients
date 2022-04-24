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
    as = ImmutableMolecularSequence_Roc.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Roc {
  Optional<List<Extension>> modifierExtension();

  Optional<List<decimal>> fMeasure();

  Optional<List<Integer>> numFP();

  Optional<List<Integer>> numTP();

  Optional<List<Integer>> numFN();

  Optional<List<decimal>> precision();

  Optional<List<decimal>> sensitivity();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Integer>> score();

  static ImmutableMolecularSequence_Roc.Builder builder() {
    return ImmutableMolecularSequence_Roc.builder();
  }
}
