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
    as = ImmutableClinicalImpression.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClinicalImpression {
  Optional<List<Annotation>> note();

  Optional<List<Reference>> supportingInfo();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<String> summary();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> problem();

  Optional<Reference> encounter();

  Optional<List<ClinicalImpression_Finding>> finding();

  String resourceType();

  Optional<CodeableConcept> code();

  Optional<CodeableConcept> statusReason();

  Optional<String> effectiveDateTime();

  Optional<Code> language();

  Optional<List<CodeableConcept>> prognosisCodeableConcept();

  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ClinicalImpression_Investigation>> investigation();

  Reference subject();

  Optional<Period> effectivePeriod();

  Optional<Uri> implicitRules();

  Optional<Reference> assessor();

  Optional<List<Uri>> protocol();

  Optional<List<Reference>> prognosisReference();

  Optional<Reference> previous();

  Optional<Code> status();

  static ImmutableClinicalImpression.ResourceTypeBuildStage builder() {
    return ImmutableClinicalImpression.builder();
  }
}
