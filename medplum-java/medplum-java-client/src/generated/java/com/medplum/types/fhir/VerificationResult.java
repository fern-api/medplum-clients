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
  Optional<Uri> implicitRules();

  Optional<Timing> frequency();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Code> status();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<DateTime> statusDate();

  Optional<List<VerificationResult_PrimarySource>> primarySource();

  Optional<CodeableConcept> validationType();

  Optional<List<CodeableConcept>> validationProcess();

  Optional<Date> nextScheduled();

  Optional<Narrative> text();

  Optional<CodeableConcept> failureAction();

  Optional<List<Reference>> target();

  Optional<CodeableConcept> need();

  Optional<VerificationResult_Attestation> attestation();

  Optional<List<String>> targetLocation();

  Optional<List<VerificationResult_Validator>> validator();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<DateTime> lastPerformed();

  static ImmutableVerificationResult.ResourceTypeBuildStage builder() {
    return ImmutableVerificationResult.builder();
  }
}
