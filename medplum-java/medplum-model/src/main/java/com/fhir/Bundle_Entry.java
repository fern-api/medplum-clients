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
    as = ImmutableBundle_Entry.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Entry {
  Optional<String> id();

  Optional<ResourceList> resource();

  Optional<List<Bundle_Link>> link();

  Optional<Bundle_Search> search();

  Optional<List<Extension>> extension();

  Optional<Bundle_Response> response();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> fullUrl();

  Optional<Bundle_Request> request();

  static ImmutableBundle_Entry.Builder builder() {
    return ImmutableBundle_Entry.builder();
  }
}
