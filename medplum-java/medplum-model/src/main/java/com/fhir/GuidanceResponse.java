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
    as = ImmutableGuidanceResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface GuidanceResponse {
  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> encounter();

  Optional<List<Extension>> modifierExtension();

  Optional<GuidanceresponseStatus> status();

  Optional<Meta> meta();

  Optional<List<Reference>> evaluationMessage();

  Optional<Reference> performer();

  Optional<List<Identifier>> identifier();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> moduleCodeableConcept();

  Optional<Narrative> text();

  Optional<Reference> outputParameters();

  String resourceType();

  Optional<List<Annotation>> note();

  Optional<id> id();

  Optional<code> language();

  Optional<dateTime> occurrenceDateTime();

  Optional<String> moduleCanonical();

  Optional<Reference> subject();

  Optional<String> moduleUri();

  Optional<List<Extension>> extension();

  Optional<Identifier> requestIdentifier();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> result();

  static ImmutableGuidanceResponse.ResourceTypeBuildStage builder() {
    return ImmutableGuidanceResponse.builder();
  }
}
