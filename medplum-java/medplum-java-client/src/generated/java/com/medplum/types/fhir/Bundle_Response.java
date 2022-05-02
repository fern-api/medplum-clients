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

  Optional<String> status();

  Optional<ResourceList> outcome();

  Optional<List<Extension>> extension();

  Optional<Uri> location();

  Optional<String> id();

  Optional<Instant> lastModified();

  Optional<String> etag();

  static ImmutableBundle_Response.Builder builder() {
    return ImmutableBundle_Response.builder();
  }
}
