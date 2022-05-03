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
    as = ImmutableBundle_Request.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Request {
  Optional<String> ifNoneMatch();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> ifNoneExist();

  Optional<Instant> ifModifiedSince();

  Optional<String> id();

  Optional<Bundle_requestMethod> method();

  Optional<Uri> url();

  Optional<String> ifMatch();

  static ImmutableBundle_Request.Builder builder() {
    return ImmutableBundle_Request.builder();
  }
}
