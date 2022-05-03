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
  Optional<Markdown> citation();

  Optional<List<Extension>> extension();

  Optional<RelatedartifactType> type();

  Optional<String> label();

  Optional<Canonical> resource();

  Optional<String> id();

  Optional<String> display();

  Optional<Url> url();

  Optional<Attachment> document();

  static ImmutableRelatedArtifact.Builder builder() {
    return ImmutableRelatedArtifact.builder();
  }
}
