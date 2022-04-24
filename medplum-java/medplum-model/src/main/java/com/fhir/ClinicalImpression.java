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
    as = ImmutableClinicalImpression.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ClinicalImpression {
  Optional<String> effectiveDateTime();

  Optional<List<ClinicalImpression_Investigation>> investigation();

  Reference subject();

  Optional<List<Annotation>> note();

  Optional<Narrative> text();

  Optional<Reference> assessor();

  Optional<CodeableConcept> statusReason();

  Optional<List<Reference>> prognosisReference();

  Optional<uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<Period> effectivePeriod();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> code();

  Optional<Reference> previous();

  Optional<code> language();

  Optional<String> summary();

  String resourceType();

  Optional<List<CodeableConcept>> prognosisCodeableConcept();

  Optional<List<Reference>> problem();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Reference>> supportingInfo();

  Optional<List<uri>> protocol();

  Optional<code> status();

  Optional<Reference> encounter();

  Optional<dateTime> date();

  Optional<List<ClinicalImpression_Finding>> finding();

  Optional<id> id();

  static ImmutableClinicalImpression.SubjectBuildStage builder() {
    return ImmutableClinicalImpression.builder();
  }
}
