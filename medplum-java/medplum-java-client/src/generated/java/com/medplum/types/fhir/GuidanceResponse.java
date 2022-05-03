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
  Optional<String> moduleUri();

  Optional<List<Reference>> reasonReference();

  Optional<Reference> subject();

  Optional<Reference> encounter();

  Optional<Identifier> requestIdentifier();

  Optional<CodeableConcept> moduleCodeableConcept();

  Optional<List<Reference>> evaluationMessage();

  Optional<Reference> outputParameters();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<Reference> result();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Reference> performer();

  Optional<List<DataRequirement>> dataRequirement();

  Optional<Id> id();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<String> moduleCanonical();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> occurrenceDateTime();

  Optional<GuidanceresponseStatus> status();

  static ImmutableGuidanceResponse.ResourceTypeBuildStage builder() {
    return ImmutableGuidanceResponse.builder();
  }
}
