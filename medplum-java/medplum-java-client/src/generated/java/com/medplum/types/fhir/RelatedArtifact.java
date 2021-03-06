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
    as = ImmutableRelatedArtifact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RelatedArtifact {
  Optional<Url> url();

  Optional<String> display();

  Optional<RelatedartifactType> type();

  Optional<List<Extension>> extension();

  Optional<Attachment> document();

  Optional<String> id();

  Optional<String> label();

  Optional<Canonical> resource();

  Optional<Markdown> citation();

  static ImmutableRelatedArtifact.Builder builder() {
    return ImmutableRelatedArtifact.builder();
  }
}
