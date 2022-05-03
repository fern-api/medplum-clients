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
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> performer();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<Period> occurrencePeriod();

  Optional<List<RiskAssessment_Prediction>> prediction();

  Reference subject();

  Optional<Reference> condition();

  Optional<Reference> parent();

  Optional<List<Reference>> basis();

  Optional<Narrative> text();

  Optional<Reference> basedOn();

  Optional<String> occurrenceDateTime();

  Optional<CodeableConcept> method();

  Optional<Reference> encounter();

  Optional<String> mitigation();

  Optional<CodeableConcept> code();

  Optional<Code> language();

  Optional<Code> status();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> reasonReference();

  Optional<List<Annotation>> note();

  static ImmutableRiskAssessment.SubjectBuildStage builder() {
    return ImmutableRiskAssessment.builder();
  }
}
