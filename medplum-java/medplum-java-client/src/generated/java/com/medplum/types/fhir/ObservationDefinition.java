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
  Optional<Narrative> text();

  Optional<CodeableConcept> method();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<Boolean> multipleResultsAllowed();

  Optional<Id> id();

  CodeableConcept code();

  Optional<List<ResourceList>> contained();

  Optional<String> preferredReportName();

  Optional<Reference> criticalCodedValueSet();

  Optional<Reference> validCodedValueSet();

  Optional<Reference> abnormalCodedValueSet();

  Optional<List<CodeableConcept>> category();

  Optional<Reference> normalCodedValueSet();

  Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType();

  Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval();

  Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  static ImmutableObservationDefinition.CodeBuildStage builder() {
    return ImmutableObservationDefinition.builder();
  }
}
