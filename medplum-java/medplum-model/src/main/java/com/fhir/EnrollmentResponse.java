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
    as = ImmutableEnrollmentResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EnrollmentResponse {
  Optional<id> id();

  Optional<String> disposition();

  Optional<Reference> organization();

  Optional<code> language();

  Optional<code> status();

  Optional<Reference> request();

  Optional<EnrollmentresponseOutcome> outcome();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<dateTime> created();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> requestProvider();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  static ImmutableEnrollmentResponse.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentResponse.builder();
  }
}
