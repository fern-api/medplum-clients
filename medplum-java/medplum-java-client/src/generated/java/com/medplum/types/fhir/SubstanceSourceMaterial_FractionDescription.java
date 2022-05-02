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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> materialType();

  Optional<String> fraction();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSourceMaterial_FractionDescription.Builder builder() {
    return ImmutableSubstanceSourceMaterial_FractionDescription.builder();
  }
}
