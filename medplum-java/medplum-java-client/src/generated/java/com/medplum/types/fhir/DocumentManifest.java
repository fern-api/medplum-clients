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
    as = ImmutableDocumentManifest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentManifest {
  Optional<List<DocumentManifest_Related>> related();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Reference>> recipient();

  Optional<List<Reference>> author();

  Optional<CodeableConcept> type();

  Optional<Id> id();

  Optional<Identifier> masterIdentifier();

  Optional<DocumentmanifestStatus> status();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<Reference> subject();

  List<Reference> content();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> created();

  Optional<List<Extension>> extension();

  Optional<Code> language();

  String resourceType();

  Optional<Uri> source();

  Optional<Narrative> text();

  Optional<String> description();

  static ImmutableDocumentManifest.ResourceTypeBuildStage builder() {
    return ImmutableDocumentManifest.builder();
  }
}
