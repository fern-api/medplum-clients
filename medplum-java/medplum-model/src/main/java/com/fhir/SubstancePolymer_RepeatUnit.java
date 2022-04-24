package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstancePolymer_RepeatUnit.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_RepeatUnit {
  Optional<List<Extension>> extension();

  Optional<List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<SubstanceAmount> amount();

  Optional<CodeableConcept> orientationOfPolymerisation();

  Optional<List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation();

  Optional<String> repeatUnit();

  static ImmutableSubstancePolymer_RepeatUnit.Builder builder() {
    return ImmutableSubstancePolymer_RepeatUnit.builder();
  }
}
