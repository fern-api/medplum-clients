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
  Optional<CodeableConcept> code();

  Optional<Id> id();

  Optional<List<ClinicalImpression_Finding>> finding();

  Optional<DateTime> date();

  Optional<Code> status();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<String> summary();

  Optional<List<Uri>> protocol();

  Optional<Reference> assessor();

  Optional<List<CodeableConcept>> prognosisCodeableConcept();

  Reference subject();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<Reference>> supportingInfo();

  Optional<List<Reference>> prognosisReference();

  Optional<List<ClinicalImpression_Investigation>> investigation();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Period> effectivePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> previous();

  Optional<String> effectiveDateTime();

  Optional<CodeableConcept> statusReason();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> problem();

  Optional<Reference> encounter();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<String> description();

  static ImmutableClinicalImpression.SubjectBuildStage builder() {
    return ImmutableClinicalImpression.builder();
  }
}
