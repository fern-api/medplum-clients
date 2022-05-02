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
  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> candidate();

  Optional<Reference> insurer();

  Optional<Reference> provider();

  Optional<Code> language();

  Optional<Code> status();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<Reference> coverage();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<DateTime> created();

  Optional<List<ResourceList>> contained();

  static ImmutableEnrollmentRequest.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentRequest.builder();
  }
}
