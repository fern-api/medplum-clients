package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceSourceMaterial_OrganismGeneral.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_OrganismGeneral {
  Optional<List<Extension>> modifierExtension();

  @JsonProperty("class")
  Optional<CodeableConcept> _class();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> phylum();

  Optional<CodeableConcept> order();

  Optional<CodeableConcept> kingdom();

  Optional<String> id();

  static ImmutableSubstanceSourceMaterial_OrganismGeneral.Builder builder() {
    return ImmutableSubstanceSourceMaterial_OrganismGeneral.builder();
  }
}
