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
    as = ImmutableSubstancePolymer_Repeat.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_Repeat {
  Optional<CodeableConcept> repeatUnitAmountType();

  Optional<Integer> numberOfUnits();

  Optional<String> averageMolecularFormula();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstancePolymer_RepeatUnit>> repeatUnit();

  static ImmutableSubstancePolymer_Repeat.Builder builder() {
    return ImmutableSubstancePolymer_Repeat.builder();
  }
}
