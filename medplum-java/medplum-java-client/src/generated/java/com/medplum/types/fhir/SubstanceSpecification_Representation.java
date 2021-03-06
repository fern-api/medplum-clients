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
    as = ImmutableSubstanceSpecification_Representation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Representation {
  Optional<List<Extension>> extension();

  Optional<Attachment> attachment();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<String> representation();

  Optional<String> id();

  static ImmutableSubstanceSpecification_Representation.Builder builder() {
    return ImmutableSubstanceSpecification_Representation.builder();
  }
}
