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
  Optional<List<Reference>> author();

  Optional<Code> language();

  Optional<DocumentReference_Context> context();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Code> docStatus();

  List<DocumentReference_Content> content();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> securityLabel();

  Optional<Reference> authenticator();

  Optional<List<Extension>> extension();

  Optional<DocumentreferenceStatus> status();

  Optional<Reference> subject();

  Optional<Identifier> masterIdentifier();

  Optional<CodeableConcept> type();

  Optional<List<CodeableConcept>> category();

  Optional<List<DocumentReference_RelatesTo>> relatesTo();

  Optional<Instant> date();

  Optional<String> description();

  Optional<Reference> custodian();

  static ImmutableDocumentReference.ResourceTypeBuildStage builder() {
    return ImmutableDocumentReference.builder();
  }
}
