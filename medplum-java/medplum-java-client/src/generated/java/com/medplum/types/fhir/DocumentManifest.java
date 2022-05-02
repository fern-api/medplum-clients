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
  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> created();

  Optional<Identifier> masterIdentifier();

  Optional<Uri> source();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> type();

  Optional<Uri> implicitRules();

  Optional<String> description();

  Optional<List<Reference>> author();

  Optional<Reference> subject();

  Optional<List<Extension>> extension();

  Optional<DocumentmanifestStatus> status();

  String resourceType();

  Optional<List<Reference>> recipient();

  Optional<Id> id();

  List<Reference> content();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<DocumentManifest_Related>> related();

  Optional<List<Identifier>> identifier();

  static ImmutableDocumentManifest.ResourceTypeBuildStage builder() {
    return ImmutableDocumentManifest.builder();
  }
}
