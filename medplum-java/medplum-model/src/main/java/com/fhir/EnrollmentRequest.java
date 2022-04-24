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
    as = ImmutableEnrollmentRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EnrollmentRequest {
  String resourceType();

  Optional<dateTime> created();

  Optional<List<Extension>> extension();

  Optional<Reference> candidate();

  Optional<Reference> provider();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<Reference> insurer();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> coverage();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<code> status();

  Optional<uri> implicitRules();

  Optional<id> id();

  static ImmutableEnrollmentRequest.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentRequest.builder();
  }
}
