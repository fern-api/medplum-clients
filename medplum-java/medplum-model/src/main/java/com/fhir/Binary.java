package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableBinary.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Binary {
  Optional<code> contentType();

  Optional<Reference> securityContext();

  Optional<base64Binary> data();

  Optional<id> id();

  String resourceType();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<code> language();

  static ImmutableBinary.ResourceTypeBuildStage builder() {
    return ImmutableBinary.builder();
  }
}
