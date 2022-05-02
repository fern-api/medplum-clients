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
  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<String> description();

  Optional<Uri> implicitRules();

  Optional<Code> docStatus();

  String resourceType();

  Optional<DocumentreferenceStatus> status();

  Optional<Instant> date();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> author();

  Optional<Reference> subject();

  Optional<Reference> authenticator();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> securityLabel();

  Optional<List<Identifier>> identifier();

  List<DocumentReference_Content> content();

  Optional<CodeableConcept> type();

  Optional<List<DocumentReference_RelatesTo>> relatesTo();

  Optional<Code> language();

  Optional<Reference> custodian();

  Optional<List<CodeableConcept>> category();

  Optional<Identifier> masterIdentifier();

  Optional<Narrative> text();

  Optional<DocumentReference_Context> context();

  static ImmutableDocumentReference.ResourceTypeBuildStage builder() {
    return ImmutableDocumentReference.builder();
  }
}
