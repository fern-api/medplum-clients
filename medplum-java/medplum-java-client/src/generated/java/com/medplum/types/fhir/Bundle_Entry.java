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
    as = ImmutableBundle_Entry.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Entry {
  Optional<ResourceList> resource();

  Optional<List<Bundle_Link>> link();

  Optional<Bundle_Response> response();

  Optional<List<Extension>> extension();

  Optional<Uri> fullUrl();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Bundle_Request> request();

  Optional<Bundle_Search> search();

  static ImmutableBundle_Entry.Builder builder() {
    return ImmutableBundle_Entry.builder();
  }
}
