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
    as = ImmutableContract_Subject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Subject {
  Optional<List<Extension>> modifierExtension();

  List<Reference> reference();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<CodeableConcept> role();

  static ImmutableContract_Subject.Builder builder() {
    return ImmutableContract_Subject.builder();
  }
}
