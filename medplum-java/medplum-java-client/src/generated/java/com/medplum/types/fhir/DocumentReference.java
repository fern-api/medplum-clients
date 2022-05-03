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
    as = ImmutableDocumentReference.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference {
  Optional<List<Identifier>> identifier();

  Optional<Reference> subject();

  Optional<List<ResourceList>> contained();

  Optional<Code> docStatus();

  Optional<Code> language();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> category();

  Optional<List<CodeableConcept>> securityLabel();

  Optional<Id> id();

  Optional<Identifier> masterIdentifier();

  Optional<Reference> custodian();

  Optional<DocumentReference_Context> context();

  Optional<Reference> authenticator();

  Optional<DocumentreferenceStatus> status();

  Optional<Meta> meta();

  Optional<Instant> date();

  Optional<String> description();

  List<DocumentReference_Content> content();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<Reference>> author();

  Optional<List<DocumentReference_RelatesTo>> relatesTo();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  static ImmutableDocumentReference.ResourceTypeBuildStage builder() {
    return ImmutableDocumentReference.builder();
  }
}
