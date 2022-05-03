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
  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<DateTime> created();

  Optional<Reference> request();

  Optional<EnrollmentresponseOutcome> outcome();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Narrative> text();

  Optional<Reference> requestProvider();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Reference> organization();

  Optional<Code> status();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<String> disposition();

  static ImmutableEnrollmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentResponse.builder();
  }
}
