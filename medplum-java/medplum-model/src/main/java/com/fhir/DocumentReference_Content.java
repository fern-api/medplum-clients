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
    as = ImmutableDocumentReference_Content.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference_Content {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<Coding> format();

  Optional<List<Extension>> modifierExtension();

  Attachment attachment();

  static ImmutableDocumentReference_Content.AttachmentBuildStage builder() {
    return ImmutableDocumentReference_Content.builder();
  }
}
