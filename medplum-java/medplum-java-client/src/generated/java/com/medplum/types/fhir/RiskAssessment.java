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

  String resourceType();

  Optional<Reference> condition();

  Optional<Id> id();

  Optional<Code> status();

  Optional<Period> occurrencePeriod();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<String> mitigation();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> encounter();

  Optional<Reference> basedOn();

  Optional<List<Reference>> basis();

  Optional<CodeableConcept> method();

  Reference subject();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Identifier>> identifier();

  Optional<Uri> implicitRules();

  Optional<String> occurrenceDateTime();

  Optional<List<RiskAssessment_Prediction>> prediction();

  Optional<Reference> parent();

  Optional<List<Annotation>> note();

  Optional<Reference> performer();

  static ImmutableRiskAssessment.ResourceTypeBuildStage builder() {
    return ImmutableRiskAssessment.builder();
  }
}
