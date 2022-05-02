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
  Optional<List<Uri>> protocol();

  Optional<List<Annotation>> note();

  Optional<String> effectiveDateTime();

  Optional<Code> language();

  Optional<Period> effectivePeriod();

  Optional<List<Reference>> prognosisReference();

  Optional<Reference> encounter();

  Optional<List<CodeableConcept>> prognosisCodeableConcept();

  Optional<List<Extension>> modifierExtension();

  Reference subject();

  Optional<CodeableConcept> statusReason();

  Optional<Code> status();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<Reference> previous();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> code();

  Optional<DateTime> date();

  Optional<List<ResourceList>> contained();

  Optional<List<ClinicalImpression_Finding>> finding();

  Optional<String> summary();

  Optional<Reference> assessor();

  Optional<String> description();

  Optional<Uri> implicitRules();

  Optional<List<ClinicalImpression_Investigation>> investigation();

  Optional<List<Reference>> supportingInfo();

  Optional<List<Reference>> problem();

  static ImmutableClinicalImpression.SubjectBuildStage builder() {
    return ImmutableClinicalImpression.builder();
  }
}
