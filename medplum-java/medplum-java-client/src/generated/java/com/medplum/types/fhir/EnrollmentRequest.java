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
  Optional<Reference> coverage();

  Optional<Reference> candidate();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Code> status();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> created();

  Optional<Code> language();

  Optional<Reference> provider();

  Optional<List<Extension>> extension();

  Optional<Reference> insurer();

  Optional<Meta> meta();

  Optional<Id> id();

  static ImmutableEnrollmentRequest.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentRequest.builder();
  }
}
