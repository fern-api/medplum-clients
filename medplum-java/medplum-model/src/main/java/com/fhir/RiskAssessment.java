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
    as = ImmutableRiskAssessment.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RiskAssessment {
  Optional<List<Extension>> modifierExtension();

  Optional<List<RiskAssessment_Prediction>> prediction();

  Optional<Reference> basedOn();

  Optional<Reference> parent();

  Optional<List<Reference>> basis();

  Optional<String> mitigation();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> reasonReference();

  Optional<Meta> meta();

  Optional<Period> occurrencePeriod();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<code> language();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<List<ResourceList>> contained();

  Optional<code> status();

  Optional<CodeableConcept> method();

  Optional<Reference> performer();

  String resourceType();

  Optional<Reference> condition();

  Reference subject();

  Optional<List<Identifier>> identifier();

  Optional<uri> implicitRules();

  Optional<List<Annotation>> note();

  Optional<String> occurrenceDateTime();

  Optional<Reference> encounter();

  Optional<id> id();

  static ImmutableRiskAssessment.ResourceTypeBuildStage builder() {
    return ImmutableRiskAssessment.builder();
  }
}
