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
    as = ImmutableSubstanceSourceMaterial_Hybrid.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_Hybrid {
  Optional<String> paternalOrganismId();

  Optional<List<Extension>> extension();

  Optional<String> maternalOrganismId();

  Optional<String> maternalOrganismName();

  Optional<List<Extension>> modifierExtension();

  Optional<String> paternalOrganismName();

  Optional<String> id();

  Optional<CodeableConcept> hybridType();

  static ImmutableSubstanceSourceMaterial_Hybrid.Builder builder() {
    return ImmutableSubstanceSourceMaterial_Hybrid.builder();
  }
}
