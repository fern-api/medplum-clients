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
    as = ImmutableEnrollmentResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EnrollmentResponse {
  Optional<String> disposition();

  Optional<Reference> requestProvider();

  Optional<DateTime> created();

  Optional<Code> language();

  Optional<EnrollmentresponseOutcome> outcome();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Reference> organization();

  Optional<Reference> request();

  Optional<Id> id();

  Optional<Code> status();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  static ImmutableEnrollmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentResponse.builder();
  }
}
