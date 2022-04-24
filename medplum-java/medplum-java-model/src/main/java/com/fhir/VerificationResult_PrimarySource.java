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
    as = ImmutableVerificationResult_PrimarySource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult_PrimarySource {
  Optional<CodeableConcept> validationStatus();

  Optional<List<CodeableConcept>> type();

  Optional<Reference> who();

  Optional<dateTime> validationDate();

  Optional<List<CodeableConcept>> pushTypeAvailable();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> canPushUpdates();

  Optional<List<CodeableConcept>> communicationMethod();

  Optional<List<Extension>> modifierExtension();

  static ImmutableVerificationResult_PrimarySource.Builder builder() {
    return ImmutableVerificationResult_PrimarySource.builder();
  }
}
