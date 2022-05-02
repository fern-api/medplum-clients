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
    as = ImmutableSubstanceSourceMaterial_FractionDescription.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_FractionDescription {
  Optional<CodeableConcept> materialType();

  Optional<List<Extension>> modifierExtension();

  Optional<String> fraction();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableSubstanceSourceMaterial_FractionDescription.Builder builder() {
    return ImmutableSubstanceSourceMaterial_FractionDescription.builder();
  }
}
