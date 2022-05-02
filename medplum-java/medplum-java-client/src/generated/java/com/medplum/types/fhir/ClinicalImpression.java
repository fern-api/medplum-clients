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

  Optional<Code> status();

  Optional<List<Reference>> prognosisReference();

  Optional<Reference> previous();

  Optional<List<Uri>> protocol();

  Optional<Period> effectivePeriod();

  Optional<String> summary();

  Optional<CodeableConcept> statusReason();

  Optional<String> description();

  Optional<List<Reference>> supportingInfo();

  Reference subject();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<ClinicalImpression_Finding>> finding();

  Optional<Reference> encounter();

  Optional<List<Reference>> problem();

  Optional<Code> language();

  Optional<CodeableConcept> code();

  Optional<Id> id();

  Optional<String> effectiveDateTime();

  Optional<Narrative> text();

  Optional<Reference> assessor();

  Optional<List<CodeableConcept>> prognosisCodeableConcept();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  String resourceType();

  Optional<List<ClinicalImpression_Investigation>> investigation();

  static ImmutableClinicalImpression.SubjectBuildStage builder() {
    return ImmutableClinicalImpression.builder();
  }
}
