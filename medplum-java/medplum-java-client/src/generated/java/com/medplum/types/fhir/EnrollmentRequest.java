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
    as = ImmutableEnrollmentRequest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EnrollmentRequest {
  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Code> status();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<Reference> insurer();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> provider();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Code> language();

  Optional<DateTime> created();

  Optional<Reference> coverage();

  Optional<Reference> candidate();

  static ImmutableEnrollmentRequest.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentRequest.builder();
  }
}
