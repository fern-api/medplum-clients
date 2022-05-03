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
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<CodeableConcept> role();

  Optional<List<Extension>> extension();

  List<Reference> reference();

  static ImmutableContract_Subject.Builder builder() {
    return ImmutableContract_Subject.builder();
  }
}
