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
  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Reference> provider();

  Optional<Id> id();

  Optional<Code> language();

  Optional<DateTime> created();

  Optional<Uri> implicitRules();

  Optional<Reference> insurer();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> coverage();

  String resourceType();

  Optional<Code> status();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<Reference> candidate();

  Optional<List<ResourceList>> contained();

  static ImmutableEnrollmentRequest.ResourceTypeBuildStage builder() {
    return ImmutableEnrollmentRequest.builder();
  }
}
