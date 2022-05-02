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
  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<List<String>> targetLocation();

  Optional<List<VerificationResult_PrimarySource>> primarySource();

  Optional<Timing> frequency();

  Optional<DateTime> statusDate();

  Optional<Id> id();

  Optional<DateTime> lastPerformed();

  Optional<List<VerificationResult_Validator>> validator();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> validationProcess();

  Optional<Code> language();

  Optional<CodeableConcept> failureAction();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<List<Reference>> target();

  Optional<Date> nextScheduled();

  Optional<CodeableConcept> validationType();

  Optional<List<Extension>> extension();

  Optional<Code> status();

  Optional<CodeableConcept> need();

  Optional<VerificationResult_Attestation> attestation();

  static ImmutableVerificationResult.ResourceTypeBuildStage builder() {
    return ImmutableVerificationResult.builder();
  }
}
