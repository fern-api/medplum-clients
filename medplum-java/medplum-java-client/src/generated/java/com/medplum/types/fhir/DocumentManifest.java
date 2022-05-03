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
  Optional<String> description();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<DateTime> created();

  Optional<Code> language();

  Optional<Identifier> masterIdentifier();

  Optional<List<Extension>> modifierExtension();

  Optional<DocumentmanifestStatus> status();

  Optional<List<DocumentManifest_Related>> related();

  Optional<Uri> source();

  Optional<Reference> subject();

  Optional<List<Reference>> author();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> type();

  Optional<List<Reference>> recipient();

  Optional<Meta> meta();

  List<Reference> content();

  static ImmutableDocumentManifest.ResourceTypeBuildStage builder() {
    return ImmutableDocumentManifest.builder();
  }
}
