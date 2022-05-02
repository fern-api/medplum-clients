package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<CodeableConcept> orientationOfPolymerisation();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> repeatUnit();

  Optional<List<Extension>> modifierExtension();

  Optional<List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation();

  Optional<List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation();

  Optional<SubstanceAmount> amount();

  static ImmutableSubstancePolymer_RepeatUnit.Builder builder() {
    return ImmutableSubstancePolymer_RepeatUnit.builder();
  }
}
