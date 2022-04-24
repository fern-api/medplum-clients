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
    as = ImmutableMolecularSequence_Quality.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Quality {
  Optional<CodeableConcept> standardSequence();

  Optional<decimal> truthTP();

  Optional<decimal> queryFP();

  Optional<Quantity> score();

  Optional<decimal> precision();

  Optional<String> id();

  Optional<Molecularsequence_qualityType> type();

  Optional<decimal> fScore();

  Optional<decimal> truthFN();

  Optional<decimal> recall();

  Optional<MolecularSequence_Roc> roc();

  Optional<decimal> gtFP();

  Optional<CodeableConcept> method();

  Optional<List<Extension>> modifierExtension();

  Optional<decimal> queryTP();

  Optional<Integer> end();

  Optional<Integer> start();

  Optional<List<Extension>> extension();

  static ImmutableMolecularSequence_Quality.Builder builder() {
    return ImmutableMolecularSequence_Quality.builder();
  }
}
