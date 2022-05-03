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
    as = ImmutableContract_Subject.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Subject {
  Optional<CodeableConcept> role();

  Optional<String> id();

  List<Reference> reference();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableContract_Subject.Builder builder() {
    return ImmutableContract_Subject.builder();
  }
}
