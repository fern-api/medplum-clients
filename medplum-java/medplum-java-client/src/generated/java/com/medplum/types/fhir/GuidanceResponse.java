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
  Optional<String> moduleCanonical();

  Optional<Code> language();

  Optional<List<Reference>> reasonReference();

  Optional<String> moduleUri();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> result();

  Optional<Reference> encounter();

  Optional<DateTime> occurrenceDateTime();

  Optional<List<Reference>> evaluationMessage();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<Id> id();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Identifier> requestIdentifier();

  Optional<List<Identifier>> identifier();

  Optional<Reference> outputParameters();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<GuidanceresponseStatus> status();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> moduleCodeableConcept();

  Optional<Reference> subject();

  Optional<Reference> performer();

  Optional<List<Annotation>> note();

  Optional<Meta> meta();

  static ImmutableGuidanceResponse.ResourceTypeBuildStage builder() {
    return ImmutableGuidanceResponse.builder();
  }
}
