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
  Optional<Decimal> fScore();

  Optional<Decimal> recall();

  Optional<Decimal> gtFP();

  Optional<CodeableConcept> standardSequence();

  Optional<List<Extension>> modifierExtension();

  Optional<Decimal> truthFN();

  Optional<MolecularSequence_Roc> roc();

  Optional<Integer> start();

  Optional<Integer> end();

  Optional<Decimal> queryFP();

  Optional<Decimal> queryTP();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Decimal> precision();

  Optional<Molecularsequence_qualityType> type();

  Optional<Quantity> score();

  Optional<CodeableConcept> method();

  Optional<Decimal> truthTP();

  static ImmutableMolecularSequence_Quality.Builder builder() {
    return ImmutableMolecularSequence_Quality.builder();
  }
}
