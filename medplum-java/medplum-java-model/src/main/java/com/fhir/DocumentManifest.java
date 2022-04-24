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
    as = ImmutableDocumentManifest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentManifest {
  Optional<List<Reference>> recipient();

  Optional<Identifier> masterIdentifier();

  Optional<List<Reference>> author();

  Optional<List<DocumentManifest_Related>> related();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<dateTime> created();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<code> language();

  Optional<DocumentmanifestStatus> status();

  Optional<List<ResourceList>> contained();

  List<Reference> content();

  Optional<uri> source();

  Optional<CodeableConcept> type();

  Optional<String> description();

  Optional<uri> implicitRules();

  Optional<Reference> subject();

  static ImmutableDocumentManifest.ResourceTypeBuildStage builder() {
    return ImmutableDocumentManifest.builder();
  }
}
