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
  Optional<Canonical> resource();

  Optional<Markdown> citation();

  Optional<RelatedartifactType> type();

  Optional<String> id();

  Optional<Attachment> document();

  Optional<String> label();

  Optional<List<Extension>> extension();

  Optional<String> display();

  Optional<Url> url();

  static ImmutableRelatedArtifact.Builder builder() {
    return ImmutableRelatedArtifact.builder();
  }
}
