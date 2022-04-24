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
    as = ImmutableRelatedArtifact.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RelatedArtifact {
  Optional<RelatedartifactType> type();

  Optional<String> display();

  Optional<url> url();

  Optional<markdown> citation();

  Optional<canonical> resource();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> label();

  Optional<Attachment> document();

  static ImmutableRelatedArtifact.Builder builder() {
    return ImmutableRelatedArtifact.builder();
  }
}
