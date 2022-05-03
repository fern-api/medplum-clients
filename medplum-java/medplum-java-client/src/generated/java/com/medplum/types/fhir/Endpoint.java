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
  Optional<List<String>> header();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Code>> payloadMimeType();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> contact();

  Optional<Reference> managingOrganization();

  Optional<List<Identifier>> identifier();

  Coding connectionType();

  List<CodeableConcept> payloadType();

  Optional<Narrative> text();

  Optional<Id> id();

  String resourceType();

  Optional<EndpointStatus> status();

  Optional<Url> address();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  static ImmutableEndpoint.ConnectionTypeBuildStage builder() {
    return ImmutableEndpoint.builder();
  }
}
