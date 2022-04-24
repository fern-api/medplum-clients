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
    as = ImmutableSubstanceSourceMaterial_PartDescription.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_PartDescription {
  Optional<String> id();

  Optional<CodeableConcept> part();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> partLocation();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSourceMaterial_PartDescription.Builder builder() {
    return ImmutableSubstanceSourceMaterial_PartDescription.builder();
  }
}
