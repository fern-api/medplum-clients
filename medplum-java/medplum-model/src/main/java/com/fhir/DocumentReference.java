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
    as = ImmutableDocumentReference.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference {
  Optional<Reference> subject();

  Optional<code> language();

  Optional<String> description();

  Optional<List<ResourceList>> contained();

  Optional<DocumentReference_Context> context();

  Optional<List<CodeableConcept>> category();

  Optional<List<Reference>> author();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> securityLabel();

  Optional<Meta> meta();

  Optional<code> docStatus();

  Optional<Reference> authenticator();

  Optional<List<Extension>> extension();

  Optional<DocumentreferenceStatus> status();

  Optional<id> id();

  Optional<List<DocumentReference_RelatesTo>> relatesTo();

  Optional<List<Extension>> modifierExtension();

  List<DocumentReference_Content> content();

  Optional<Narrative> text();

  Optional<Reference> custodian();

  Optional<Identifier> masterIdentifier();

  Optional<CodeableConcept> type();

  String resourceType();

  Optional<instant> date();

  Optional<uri> implicitRules();

  static ImmutableDocumentReference.ResourceTypeBuildStage builder() {
    return ImmutableDocumentReference.builder();
  }
}
