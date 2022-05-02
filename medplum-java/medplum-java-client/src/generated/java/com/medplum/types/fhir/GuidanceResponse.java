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
  Optional<List<Reference>> reasonReference();

  Optional<CodeableConcept> moduleCodeableConcept();

  Optional<Reference> outputParameters();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> occurrenceDateTime();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<Reference> result();

  Optional<Meta> meta();

  Optional<Reference> subject();

  Optional<List<Extension>> extension();

  Optional<String> moduleCanonical();

  String resourceType();

  Optional<String> moduleUri();

  Optional<GuidanceresponseStatus> status();

  Optional<Identifier> requestIdentifier();

  Optional<Reference> performer();

  Optional<Reference> encounter();

  Optional<Code> language();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> evaluationMessage();

  Optional<List<Extension>> modifierExtension();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<Uri> implicitRules();

  static ImmutableGuidanceResponse.ResourceTypeBuildStage builder() {
    return ImmutableGuidanceResponse.builder();
  }
}
