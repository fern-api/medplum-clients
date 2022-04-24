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
    as = ImmutableSpecimen_Processing.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen_Processing {
  Optional<Period> timePeriod();

  Optional<List<Reference>> additive();

  Optional<String> description();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> timeDateTime();

  Optional<CodeableConcept> procedure();

  static ImmutableSpecimen_Processing.Builder builder() {
    return ImmutableSpecimen_Processing.builder();
  }
}
