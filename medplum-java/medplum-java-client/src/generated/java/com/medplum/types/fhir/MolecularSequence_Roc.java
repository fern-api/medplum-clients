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
    as = ImmutableMolecularSequence_Roc.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Roc {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Integer>> numFN();

  Optional<List<Integer>> numFP();

  Optional<String> id();

  Optional<List<Decimal>> precision();

  Optional<List<Decimal>> fMeasure();

  Optional<List<Integer>> numTP();

  Optional<List<Decimal>> sensitivity();

  Optional<List<Extension>> extension();

  Optional<List<Integer>> score();

  static ImmutableMolecularSequence_Roc.Builder builder() {
    return ImmutableMolecularSequence_Roc.builder();
  }
}
