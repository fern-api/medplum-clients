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
    as = ImmutableDocumentManifest_Related.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentManifest_Related {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Identifier> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> ref();

  static ImmutableDocumentManifest_Related.Builder builder() {
    return ImmutableDocumentManifest_Related.builder();
  }
}
