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
  Optional<List<Extension>> extension();

  Optional<String> timeDateTime();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> procedure();

  Optional<List<Reference>> additive();

  Optional<Period> timePeriod();

  Optional<String> id();

  static ImmutableSpecimen_Processing.Builder builder() {
    return ImmutableSpecimen_Processing.builder();
  }
}
