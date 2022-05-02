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
    as = ImmutablePractitioner_Qualification.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Practitioner_Qualification {
  Optional<List<Identifier>> identifier();

  Optional<String> id();

  CodeableConcept code();

  Optional<Reference> issuer();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  static ImmutablePractitioner_Qualification.CodeBuildStage builder() {
    return ImmutablePractitioner_Qualification.builder();
  }
}
