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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> ifNoneMatch();

  Optional<String> ifMatch();

  Optional<List<Extension>> modifierExtension();

  Optional<String> ifNoneExist();

  Optional<Bundle_requestMethod> method();

  Optional<Uri> url();

  Optional<Instant> ifModifiedSince();

  static ImmutableBundle_Request.Builder builder() {
    return ImmutableBundle_Request.builder();
  }
}
