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
  Optional<List<Extension>> modifierExtension();

  Optional<Quantity> score();

  Optional<Decimal> truthTP();

  Optional<Integer> start();

  Optional<CodeableConcept> standardSequence();

  Optional<Decimal> precision();

  Optional<Decimal> queryTP();

  Optional<Decimal> recall();

  Optional<Decimal> gtFP();

  Optional<Integer> end();

  Optional<Decimal> queryFP();

  Optional<Decimal> fScore();

  Optional<Decimal> truthFN();

  Optional<String> id();

  Optional<Molecularsequence_qualityType> type();

  Optional<CodeableConcept> method();

  Optional<MolecularSequence_Roc> roc();

  Optional<List<Extension>> extension();

  static ImmutableMolecularSequence_Quality.Builder builder() {
    return ImmutableMolecularSequence_Quality.builder();
  }
}
