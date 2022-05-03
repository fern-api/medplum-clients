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
    as = ImmutableVerificationResult_PrimarySource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult_PrimarySource {
  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> validationStatus();

  Optional<List<Extension>> extension();

  Optional<Reference> who();

  Optional<DateTime> validationDate();

  Optional<List<CodeableConcept>> pushTypeAvailable();

  Optional<List<CodeableConcept>> type();

  Optional<List<CodeableConcept>> communicationMethod();

  Optional<CodeableConcept> canPushUpdates();

  Optional<String> id();

  static ImmutableVerificationResult_PrimarySource.Builder builder() {
    return ImmutableVerificationResult_PrimarySource.builder();
  }
}
