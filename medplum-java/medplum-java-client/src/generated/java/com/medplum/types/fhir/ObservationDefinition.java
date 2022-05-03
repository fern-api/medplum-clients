package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Code> language();

  Optional<Boolean> multipleResultsAllowed();

  Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval();

  Optional<Reference> normalCodedValueSet();

  Optional<Reference> criticalCodedValueSet();

  Optional<Reference> abnormalCodedValueSet();

  Optional<Narrative> text();

  Optional<Reference> validCodedValueSet();

  Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType();

  Optional<List<CodeableConcept>> category();

  Optional<Id> id();

  Optional<String> preferredReportName();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> method();

  CodeableConcept code();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails();

  static ImmutableObservationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableObservationDefinition.builder();
  }
}
