package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

  Optional<CodeableConcept> order();

  Optional<String> id();

  Optional<CodeableConcept> phylum();

  Optional<CodeableConcept> kingdom();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSourceMaterial_OrganismGeneral.Builder builder() {
    return ImmutableSubstanceSourceMaterial_OrganismGeneral.builder();
  }
}
