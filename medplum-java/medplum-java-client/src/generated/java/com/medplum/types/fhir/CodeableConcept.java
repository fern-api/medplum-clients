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
    as = ImmutableCodeableConcept.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CodeableConcept {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> coding();

  Optional<String> text();

  static ImmutableCodeableConcept.Builder builder() {
    return ImmutableCodeableConcept.builder();
  }
}
