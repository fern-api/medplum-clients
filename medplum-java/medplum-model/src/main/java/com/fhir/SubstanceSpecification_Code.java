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
    as = ImmutableSubstanceSpecification_Code.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceSpecification_Code {
  Optional<String> comment();

  Optional<List<Reference>> source();

  Optional<CodeableConcept> code();

  Optional<CodeableConcept> status();

  Optional<List<Extension>> modifierExtension();

  Optional<dateTime> statusDate();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableSubstanceSpecification_Code.Builder builder() {
    return ImmutableSubstanceSpecification_Code.builder();
  }
}
