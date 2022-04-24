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
    as = ImmutableAnnotation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Annotation {
  Optional<Reference> authorReference();

  Optional<String> authorString();

  Optional<markdown> text();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<dateTime> time();

  static ImmutableAnnotation.Builder builder() {
    return ImmutableAnnotation.builder();
  }
}
