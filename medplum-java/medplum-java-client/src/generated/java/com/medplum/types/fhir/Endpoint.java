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
  Optional<Id> id();

  Optional<Period> period();

  List<CodeableConcept> payloadType();

  Optional<Narrative> text();

  Optional<List<ContactPoint>> contact();

  Optional<Meta> meta();

  Optional<EndpointStatus> status();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  Optional<Code> language();

  Coding connectionType();

  Optional<List<Code>> payloadMimeType();

  Optional<Reference> managingOrganization();

  Optional<Url> address();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<String>> header();

  static ImmutableEndpoint.ConnectionTypeBuildStage builder() {
    return ImmutableEndpoint.builder();
  }
}
