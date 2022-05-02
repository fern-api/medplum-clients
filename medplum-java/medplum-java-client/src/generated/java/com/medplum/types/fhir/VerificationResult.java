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
    as = ImmutableVerificationResult.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface VerificationResult {
  Optional<List<VerificationResult_Validator>> validator();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> need();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<CodeableConcept>> validationProcess();

  Optional<Narrative> text();

  Optional<Code> status();

  Optional<DateTime> lastPerformed();

  Optional<List<Reference>> target();

  Optional<Timing> frequency();

  String resourceType();

  Optional<CodeableConcept> validationType();

  Optional<VerificationResult_Attestation> attestation();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> failureAction();

  Optional<List<VerificationResult_PrimarySource>> primarySource();

  Optional<DateTime> statusDate();

  Optional<Date> nextScheduled();

  Optional<List<String>> targetLocation();

  static ImmutableVerificationResult.ResourceTypeBuildStage builder() {
    return ImmutableVerificationResult.builder();
  }
}
