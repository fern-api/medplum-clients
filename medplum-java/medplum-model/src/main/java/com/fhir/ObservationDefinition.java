package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableObservationDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ObservationDefinition {
  String resourceType();

  Optional<uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Reference> criticalCodedValueSet();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<CodeableConcept> method();

  Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails();

  Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType();

  Optional<Reference> normalCodedValueSet();

  Optional<Boolean> multipleResultsAllowed();

  Optional<id> id();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Reference> validCodedValueSet();

  Optional<Reference> abnormalCodedValueSet();

  Optional<List<CodeableConcept>> category();

  Optional<String> preferredReportName();

  Optional<List<Identifier>> identifier();

  CodeableConcept code();

  Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval();

  Optional<List<Extension>> modifierExtension();

  static ImmutableObservationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableObservationDefinition.builder();
  }
}
