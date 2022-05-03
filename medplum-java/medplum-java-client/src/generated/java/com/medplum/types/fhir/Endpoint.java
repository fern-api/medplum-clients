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
  Optional<String> name();

  Optional<Meta> meta();

  Optional<EndpointStatus> status();

  Coding connectionType();

  Optional<Period> period();

  Optional<Reference> managingOrganization();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Code>> payloadMimeType();

  Optional<Url> address();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<String>> header();

  Optional<Narrative> text();

  Optional<List<ContactPoint>> contact();

  List<CodeableConcept> payloadType();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Uri> implicitRules();

  static ImmutableEndpoint.ConnectionTypeBuildStage builder() {
    return ImmutableEndpoint.builder();
  }
}
