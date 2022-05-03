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
  Optional<CodeableConcept> need();

  Optional<Meta> meta();

  Optional<DateTime> lastPerformed();

  String resourceType();

  Optional<List<VerificationResult_Validator>> validator();

  Optional<CodeableConcept> failureAction();

  Optional<Code> status();

  Optional<Date> nextScheduled();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> validationType();

  Optional<List<VerificationResult_PrimarySource>> primarySource();

  Optional<VerificationResult_Attestation> attestation();

  Optional<DateTime> statusDate();

  Optional<List<CodeableConcept>> validationProcess();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<List<String>> targetLocation();

  Optional<List<Reference>> target();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<Timing> frequency();

  static ImmutableVerificationResult.ResourceTypeBuildStage builder() {
    return ImmutableVerificationResult.builder();
  }
}
