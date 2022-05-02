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
    as = ImmutableSubstancePolymer_StructuralRepresentation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer_StructuralRepresentation {
  Optional<String> id();

  Optional<String> representation();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> extension();

  Optional<Attachment> attachment();

  static ImmutableSubstancePolymer_StructuralRepresentation.Builder builder() {
    return ImmutableSubstancePolymer_StructuralRepresentation.builder();
  }
}
