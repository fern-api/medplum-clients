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
  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<String> disposition();

  Optional<DateTime> created();

  Optional<Reference> request();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Reference> organization();

  Optional<List<Identifier>> identifier();

  Optional<Code> language();

  Optional<EnrollmentresponseOutcome> outcome();

  Optional<Reference> requestProvider();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<Code> status();

  static ImmutableEnrollmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentResponse.builder();
  }
}
