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
    as = ImmutablePractitioner_Qualification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Practitioner_Qualification {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  CodeableConcept code();

  Optional<List<Identifier>> identifier();

  Optional<Reference> issuer();

  static ImmutablePractitioner_Qualification.CodeBuildStage builder() {
    return ImmutablePractitioner_Qualification.builder();
  }
}
