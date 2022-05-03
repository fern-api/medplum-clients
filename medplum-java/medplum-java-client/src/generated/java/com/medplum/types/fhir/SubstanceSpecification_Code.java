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
    as = ImmutableSubstanceSpecification_Code.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Code {
  Optional<List<Reference>> source();

  Optional<DateTime> statusDate();

  Optional<CodeableConcept> status();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> code();

  Optional<String> comment();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSpecification_Code.Builder builder() {
    return ImmutableSubstanceSpecification_Code.builder();
  }
}
