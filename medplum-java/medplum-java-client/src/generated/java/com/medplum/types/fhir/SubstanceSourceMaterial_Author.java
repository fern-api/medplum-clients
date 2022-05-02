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
    as = ImmutableSubstanceSourceMaterial_Author.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSourceMaterial_Author {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> authorDescription();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> authorType();

  static ImmutableSubstanceSourceMaterial_Author.Builder builder() {
    return ImmutableSubstanceSourceMaterial_Author.builder();
  }
}
