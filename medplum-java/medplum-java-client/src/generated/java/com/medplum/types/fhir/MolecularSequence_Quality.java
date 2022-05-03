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
  Optional<String> id();

  Optional<Molecularsequence_qualityType> type();

  Optional<Decimal> queryTP();

  Optional<Decimal> queryFP();

  Optional<List<Extension>> modifierExtension();

  Optional<Integer> end();

  Optional<CodeableConcept> standardSequence();

  Optional<List<Extension>> extension();

  Optional<Decimal> precision();

  Optional<Integer> start();

  Optional<Decimal> truthTP();

  Optional<Decimal> fScore();

  Optional<MolecularSequence_Roc> roc();

  Optional<Quantity> score();

  Optional<CodeableConcept> method();

  Optional<Decimal> truthFN();

  Optional<Decimal> recall();

  Optional<Decimal> gtFP();

  static ImmutableMolecularSequence_Quality.Builder builder() {
    return ImmutableMolecularSequence_Quality.builder();
  }
}
