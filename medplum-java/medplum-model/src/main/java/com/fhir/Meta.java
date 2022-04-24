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
    as = ImmutableMeta.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Meta {
  Optional<List<Coding>> tag();

  Optional<id> versionId();

  Optional<uri> source();

  Optional<List<canonical>> profile();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<uri> project();

  Optional<instant> lastUpdated();

  Optional<Reference> author();

  Optional<List<Coding>> security();

  static ImmutableMeta.Builder builder() {
    return ImmutableMeta.builder();
  }
}
