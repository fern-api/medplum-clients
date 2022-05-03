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
    as = ImmutableMeta.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Meta {
  Optional<Uri> project();

  Optional<Instant> lastUpdated();

  Optional<List<Coding>> tag();

  Optional<Id> versionId();

  Optional<Uri> source();

  Optional<String> id();

  Optional<Reference> author();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> security();

  Optional<List<Canonical>> profile();

  static ImmutableMeta.Builder builder() {
    return ImmutableMeta.builder();
  }
}
