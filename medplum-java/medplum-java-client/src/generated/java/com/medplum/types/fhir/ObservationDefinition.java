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
  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept code();

  Optional<Boolean> multipleResultsAllowed();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> category();

  Optional<Narrative> text();

  Optional<String> preferredReportName();

  Optional<Reference> abnormalCodedValueSet();

  Optional<List<ObservationdefinitionPermitteddatatypeItem>> permittedDataType();

  Optional<Reference> criticalCodedValueSet();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<ObservationDefinition_QuantitativeDetails> quantitativeDetails();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<ObservationDefinition_QualifiedInterval>> qualifiedInterval();

  Optional<Reference> validCodedValueSet();

  Optional<Reference> normalCodedValueSet();

  Optional<CodeableConcept> method();

  static ImmutableObservationDefinition.CodeBuildStage builder() {
    return ImmutableObservationDefinition.builder();
  }
}
