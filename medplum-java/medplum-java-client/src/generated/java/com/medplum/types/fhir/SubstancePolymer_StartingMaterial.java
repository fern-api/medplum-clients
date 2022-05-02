package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Boolean> isDefining();

  Optional<CodeableConcept> type();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> material();

  Optional<SubstanceAmount> amount();

  static ImmutableSubstancePolymer_StartingMaterial.Builder builder() {
    return ImmutableSubstancePolymer_StartingMaterial.builder();
  }
}
