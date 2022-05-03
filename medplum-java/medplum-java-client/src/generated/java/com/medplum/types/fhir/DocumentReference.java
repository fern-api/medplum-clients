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
  Optional<Meta> meta();

  Optional<Reference> custodian();

  Optional<CodeableConcept> type();

  Optional<String> description();

  Optional<Code> language();

  Optional<List<CodeableConcept>> securityLabel();

  Optional<List<CodeableConcept>> category();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Reference> subject();

  Optional<List<Reference>> author();

  Optional<Reference> authenticator();

  Optional<List<ResourceList>> contained();

  List<DocumentReference_Content> content();

  Optional<Identifier> masterIdentifier();

  Optional<Narrative> text();

  Optional<List<DocumentReference_RelatesTo>> relatesTo();

  Optional<DocumentreferenceStatus> status();

  Optional<Instant> date();

  Optional<Uri> implicitRules();

  Optional<Code> docStatus();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<DocumentReference_Context> context();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDocumentReference.ResourceTypeBuildStage builder() {
    return ImmutableDocumentReference.builder();
  }
}
