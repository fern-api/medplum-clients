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
  Optional<CodeableConcept> phylum();

  @JsonProperty("class")
  Optional<CodeableConcept> _class();

  Optional<String> id();

  Optional<CodeableConcept> kingdom();

  Optional<CodeableConcept> order();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableSubstanceSourceMaterial_OrganismGeneral.Builder builder() {
    return ImmutableSubstanceSourceMaterial_OrganismGeneral.builder();
  }
}
