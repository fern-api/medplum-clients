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
    as = ImmutableEndpoint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Endpoint {
  Optional<Reference> managingOrganization();

  Optional<Url> address();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactPoint>> contact();

  Optional<List<Code>> payloadMimeType();

  Optional<List<Extension>> extension();

  List<CodeableConcept> payloadType();

  Optional<Code> language();

  Optional<Period> period();

  Optional<String> name();

  Coding connectionType();

  Optional<EndpointStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> header();

  static ImmutableEndpoint.ResourceTypeBuildStage builder() {
    return ImmutableEndpoint.builder();
  }
}
