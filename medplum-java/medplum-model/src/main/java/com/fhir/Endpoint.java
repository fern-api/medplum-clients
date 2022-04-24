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
    as = ImmutableEndpoint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Endpoint {
  Optional<url> address();

  Optional<List<Extension>> extension();

  Coding connectionType();

  Optional<String> name();

  Optional<Period> period();

  Optional<id> id();

  Optional<uri> implicitRules();

  Optional<List<code>> payloadMimeType();

  Optional<code> language();

  Optional<Reference> managingOrganization();

  String resourceType();

  Optional<EndpointStatus> status();

  Optional<List<String>> header();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  List<CodeableConcept> payloadType();

  Optional<List<ContactPoint>> contact();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  static ImmutableEndpoint.ConnectionTypeBuildStage builder() {
    return ImmutableEndpoint.builder();
  }
}
