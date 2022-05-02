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
    as = ImmutableRiskAssessment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskAssessment {
  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<Annotation>> note();

  Optional<Reference> basedOn();

  Optional<List<Reference>> reasonReference();

  Optional<List<Reference>> basis();

  Optional<List<Extension>> extension();

  Optional<String> occurrenceDateTime();

  Reference subject();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<String> mitigation();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Reference> parent();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> method();

  Optional<Period> occurrencePeriod();

  Optional<Reference> performer();

  Optional<Reference> encounter();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<CodeableConcept> code();

  Optional<Meta> meta();

  Optional<Reference> condition();

  Optional<Code> status();

  Optional<Uri> implicitRules();

  Optional<List<RiskAssessment_Prediction>> prediction();

  static ImmutableRiskAssessment.SubjectBuildStage builder() {
    return ImmutableRiskAssessment.builder();
  }
}
