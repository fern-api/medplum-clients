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
    as = ImmutableAnnotation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Annotation {
  Optional<String> id();

  Optional<Markdown> text();

  Optional<String> authorString();

  Optional<List<Extension>> extension();

  Optional<Reference> authorReference();

  Optional<DateTime> time();

  static ImmutableAnnotation.Builder builder() {
    return ImmutableAnnotation.builder();
  }
}
