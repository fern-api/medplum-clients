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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Attachment> document();

  Optional<Url> url();

  Optional<Canonical> resource();

  Optional<String> label();

  Optional<RelatedartifactType> type();

  Optional<Markdown> citation();

  Optional<String> display();

  static ImmutableRelatedArtifact.Builder builder() {
    return ImmutableRelatedArtifact.builder();
  }
}
