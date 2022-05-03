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
  Optional<Narrative> text();

  Optional<List<Reference>> recipient();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Reference> subject();

  Optional<List<Reference>> author();

  Optional<Code> language();

  Optional<DocumentmanifestStatus> status();

  Optional<Identifier> masterIdentifier();

  Optional<Uri> source();

  Optional<List<DocumentManifest_Related>> related();

  List<Reference> content();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<String> description();

  Optional<DateTime> created();

  static ImmutableDocumentManifest.ResourceTypeBuildStage builder() {
    return ImmutableDocumentManifest.builder();
  }
}
