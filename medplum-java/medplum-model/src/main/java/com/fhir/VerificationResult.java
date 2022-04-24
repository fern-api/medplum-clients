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
    as = ImmutableVerificationResult.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult {
  Optional<List<Reference>> target();

  Optional<List<String>> targetLocation();

  Optional<code> language();

  Optional<code> status();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> validationType();

  Optional<Timing> frequency();

  Optional<dateTime> statusDate();

  Optional<VerificationResult_Attestation> attestation();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> validationProcess();

  Optional<uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<VerificationResult_PrimarySource>> primarySource();

  Optional<List<VerificationResult_Validator>> validator();

  Optional<id> id();

  Optional<date> nextScheduled();

  Optional<CodeableConcept> need();

  Optional<Meta> meta();

  Optional<CodeableConcept> failureAction();

  Optional<dateTime> lastPerformed();

  String resourceType();

  static ImmutableVerificationResult.ResourceTypeBuildStage builder() {
    return ImmutableVerificationResult.builder();
  }
}
