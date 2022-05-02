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
    as = ImmutableGuidanceResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GuidanceResponse {
  Optional<Identifier> requestIdentifier();

  Optional<Uri> implicitRules();

  Optional<String> moduleUri();

  Optional<Reference> outputParameters();

  Optional<Narrative> text();

  Optional<List<Reference>> reasonReference();

  String resourceType();

  Optional<DateTime> occurrenceDateTime();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<GuidanceresponseStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> moduleCodeableConcept();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Reference> encounter();

  Optional<Id> id();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> evaluationMessage();

  Optional<List<Annotation>> note();

  Optional<String> moduleCanonical();

  Optional<Reference> result();

  Optional<Reference> subject();

  Optional<Reference> performer();

  static ImmutableGuidanceResponse.ResourceTypeBuildStage builder() {
    return ImmutableGuidanceResponse.builder();
  }
}
