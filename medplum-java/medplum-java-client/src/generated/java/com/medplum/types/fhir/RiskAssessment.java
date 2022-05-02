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
  Optional<CodeableConcept> code();

  Optional<Reference> encounter();

  Optional<List<ResourceList>> contained();

  Optional<List<RiskAssessment_Prediction>> prediction();

  Optional<Period> occurrencePeriod();

  Optional<String> mitigation();

  Optional<List<Reference>> reasonReference();

  Optional<Code> status();

  Optional<Reference> performer();

  Optional<Reference> condition();

  Optional<Meta> meta();

  Optional<List<Reference>> basis();

  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<String> occurrenceDateTime();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  String resourceType();

  Reference subject();

  Optional<Id> id();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> method();

  Optional<Reference> parent();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> basedOn();

  static ImmutableRiskAssessment.ResourceTypeBuildStage builder() {
    return ImmutableRiskAssessment.builder();
  }
}
