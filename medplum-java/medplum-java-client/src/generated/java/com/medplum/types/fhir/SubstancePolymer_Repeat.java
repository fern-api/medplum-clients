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
    as = ImmutableSubstancePolymer_Repeat.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_Repeat {
  Optional<List<Extension>> modifierExtension();

  Optional<Integer> numberOfUnits();

  Optional<List<SubstancePolymer_RepeatUnit>> repeatUnit();

  Optional<String> id();

  Optional<String> averageMolecularFormula();

  Optional<CodeableConcept> repeatUnitAmountType();

  Optional<List<Extension>> extension();

  static ImmutableSubstancePolymer_Repeat.Builder builder() {
    return ImmutableSubstancePolymer_Repeat.builder();
  }
}
