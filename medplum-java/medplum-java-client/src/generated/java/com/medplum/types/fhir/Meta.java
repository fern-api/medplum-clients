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
  Optional<List<Extension>> extension();

  Optional<Uri> source();

  Optional<Instant> lastUpdated();

  Optional<String> id();

  Optional<Id> versionId();

  Optional<List<Coding>> tag();

  Optional<Reference> author();

  Optional<List<Canonical>> profile();

  Optional<List<Coding>> security();

  Optional<Uri> project();

  static ImmutableMeta.Builder builder() {
    return ImmutableMeta.builder();
  }
}
