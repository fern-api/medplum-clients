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
    as = ImmutableCodeableConcept.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeableConcept {
  Optional<List<Extension>> extension();

  Optional<String> text();

  Optional<String> id();

  Optional<List<Coding>> coding();

  static ImmutableCodeableConcept.Builder builder() {
    return ImmutableCodeableConcept.builder();
  }
}
