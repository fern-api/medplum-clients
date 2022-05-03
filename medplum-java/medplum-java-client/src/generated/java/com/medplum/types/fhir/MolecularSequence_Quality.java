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
    as = ImmutableMolecularSequence_Quality.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MolecularSequence_Quality {
  Optional<Decimal> recall();

  Optional<MolecularSequence_Roc> roc();

  Optional<List<Extension>> extension();

  Optional<Decimal> precision();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> method();

  Optional<Decimal> queryTP();

  Optional<Integer> start();

  Optional<Integer> end();

  Optional<Decimal> truthTP();

  Optional<Decimal> gtFP();

  Optional<Decimal> fScore();

  Optional<String> id();

  Optional<Molecularsequence_qualityType> type();

  Optional<CodeableConcept> standardSequence();

  Optional<Quantity> score();

  Optional<Decimal> queryFP();

  Optional<Decimal> truthFN();

  static ImmutableMolecularSequence_Quality.Builder builder() {
    return ImmutableMolecularSequence_Quality.builder();
  }
}
