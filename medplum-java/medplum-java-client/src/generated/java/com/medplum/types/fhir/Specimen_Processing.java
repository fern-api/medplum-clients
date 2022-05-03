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
    as = ImmutableSpecimen_Processing.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Specimen_Processing {
  Optional<Period> timePeriod();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> procedure();

  Optional<List<Reference>> additive();

  Optional<String> timeDateTime();

  Optional<String> description();

  static ImmutableSpecimen_Processing.Builder builder() {
    return ImmutableSpecimen_Processing.builder();
  }
}
