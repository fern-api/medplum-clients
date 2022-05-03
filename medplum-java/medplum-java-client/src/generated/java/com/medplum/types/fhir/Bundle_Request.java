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
  Optional<Bundle_requestMethod> method();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Uri> url();

  Optional<List<Extension>> extension();

  Optional<String> ifNoneExist();

  Optional<Instant> ifModifiedSince();

  Optional<String> ifMatch();

  Optional<String> ifNoneMatch();

  static ImmutableBundle_Request.Builder builder() {
    return ImmutableBundle_Request.builder();
  }
}
