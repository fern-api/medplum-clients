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
  Optional<Id> id();

  Optional<CodeableConcept> method();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<CodeableConcept>> category();

  Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails();

  Optional<Reference> abnormalCodedValueSet();

  Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval();

  Optional<List<Extension>> extension();

  Optional<Reference> criticalCodedValueSet();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<Reference> validCodedValueSet();

  Optional<Boolean> multipleResultsAllowed();

  Optional<String> preferredReportName();

  CodeableConcept code();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Reference> normalCodedValueSet();

  static ImmutableObservationDefinition.ResourceTypeBuildStage builder() {
    return ImmutableObservationDefinition.builder();
  }
}
