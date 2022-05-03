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
    as = ImmutableDocumentReference_Content.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference_Content {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Coding> format();

  Attachment attachment();

  Optional<List<Extension>> modifierExtension();

  static ImmutableDocumentReference_Content.AttachmentBuildStage builder() {
    return ImmutableDocumentReference_Content.builder();
  }
}
