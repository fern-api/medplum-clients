package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstancePolymer_StartingMaterial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_StartingMaterial {
  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> isDefining();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> material();

  Optional<SubstanceAmount> amount();

  Optional<String> id();

  Optional<CodeableConcept> type();

  static ImmutableSubstancePolymer_StartingMaterial.Builder builder() {
    return ImmutableSubstancePolymer_StartingMaterial.builder();
  }
}
