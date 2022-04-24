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
    as = ImmutableBundle_Request.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Request {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> ifMatch();

  Optional<String> ifNoneExist();

  Optional<String> id();

  Optional<uri> url();

  Optional<String> ifNoneMatch();

  Optional<Bundle_requestMethod> method();

  Optional<instant> ifModifiedSince();

  static ImmutableBundle_Request.Builder builder() {
    return ImmutableBundle_Request.builder();
  }
}
