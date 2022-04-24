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
    as = ImmutableBundle_Response.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Response {
  Optional<String> status();

  Optional<String> etag();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<ResourceList> outcome();

  Optional<uri> location();

  Optional<instant> lastModified();

  Optional<List<Extension>> extension();

  static ImmutableBundle_Response.Builder builder() {
    return ImmutableBundle_Response.builder();
  }
}
