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
    as = ImmutableBundle_Response.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Response {
  Optional<List<Extension>> modifierExtension();

  Optional<Uri> location();

  Optional<Instant> lastModified();

  Optional<String> id();

  Optional<String> etag();

  Optional<List<Extension>> extension();

  Optional<String> status();

  Optional<ResourceList> outcome();

  static ImmutableBundle_Response.Builder builder() {
    return ImmutableBundle_Response.builder();
  }
}
